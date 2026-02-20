package Restaurants;

/**
 *
 * @author ZAHRA
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        
        menu.tambahMenuMakanan("Pizza", 250000, 20); 
        Restaurant.nextId();
        
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        Restaurant.nextId();
        
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30); 
        Restaurant.nextId();
        
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30); 
        
        System.out.println("=== DAFTAR MENU AWAL ===");
        menu.tampilMenuMakanan();
        
        System.out.println("\n=== MELAKUKAN PEMESANAN ===");
        menu.pesanMakanan("Pizza", 5);
        menu.pesanMakanan("Spaghetti", 25); 
        menu.pesanMakanan("Nasi Goreng", 2);
        
        System.out.println("\n=== DAFTAR MENU SETELAH PEMESANAN ===");
        menu.tampilMenuMakanan();
    }
}
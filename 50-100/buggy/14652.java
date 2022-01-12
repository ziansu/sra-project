public static void main(java.lang.String[] args) {
    java.lang.String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
    int choice = -1;
    while (choice != 0) {
        java.lang.String choiceString = javax.swing.JOptionPane.showInputDialog(menu);
        choice = java.lang.Integer.parseInt(choiceString);
        if (choice == 1) {
            view.ShopView.addProduct(shop);
        }else
            if (choice == 2) {
                view.ShopView.showProduct(shop);
            }else
                if (choice == 3) {
                    view.ShopView.showPrice(shop);
                }
            
        
    } 
}
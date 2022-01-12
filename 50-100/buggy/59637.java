public static void insertClothes(java.lang.String[] input, Assignment3.ShoppingCart cart) {
    java.lang.String name = input[2];
    float price = java.lang.Float.parseFloat(input[3]);
    int quantity = java.lang.Integer.parseInt(input[4]);
    double weight = java.lang.Double.parseDouble(input[5]);
    Assignment3.Clothing thisClothing = new Assignment3.Clothing(name, price, quantity, weight);
    cart.shoppingCart.add(thisClothing);
}
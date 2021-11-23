private static void newItemPage() {
    java.lang.System.out.println("\n\n----- Clothing Store New Item -----");
    java.lang.System.out.println(clothingstore.UI.store.listProducts());
    clothingstore.Product item_product = clothingstore.UI.store.productById(java.lang.Integer.parseInt(clothingstore.UI.getInput("Product ID: ")));
    int quantity = java.lang.Integer.parseInt(clothingstore.UI.getInput("Quantity: "));
    clothingstore.Item new_item = new clothingstore.Item(quantity, item_product);
    clothingstore.UI.store.getCart().addItem(new_item);
}
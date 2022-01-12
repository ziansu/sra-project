public void addToCart(java.lang.String itemName, int quantity, double price, java.lang.String taxStatus) {
    com.quikmart.ec.model.Item tmp = new com.quikmart.ec.model.Item(itemName, quantity, price, price, "Taxable");
    totalPrice += price * quantity;
    items.add(tmp);
    itemCount += quantity;
}
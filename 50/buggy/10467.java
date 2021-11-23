public void Order(com.codecool.shop.model.Product product, int quantity, java.lang.String status) {
    this.id = com.codecool.shop.model.Order.nextId;
    (com.codecool.shop.model.Order.nextId)++;
    this.product = product;
    this.quantity = quantity;
    this.status = "new";
}
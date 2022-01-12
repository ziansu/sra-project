public void addToWishlist() {
    if ((orderMan.findByCustomerId(customerId)) == null) {
        order = new com.netbuilder.entities.Order(loginD, com.netbuilder.enums.OrderStatus.wishlist, paymentD);
        orderLine = new com.netbuilder.entities.OrderLine(order, product);
        orderMan.persistOrder(order);
        orderLineMan.persistOrderLine(orderLine);
    }else {
        orderLine = new com.netbuilder.entities.OrderLine(order, product);
        orderLineMan.persistOrderLine(orderLine);
    }
}
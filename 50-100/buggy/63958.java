public void addToBasket() {
    if ((orderMan.findByCustomerId(customerId)) == null) {
        order = new com.netbuilder.entities.Order(1, loginD, com.netbuilder.enums.OrderStatus.basket, paymentD);
        orderLine = new com.netbuilder.entities.OrderLine(order, product, quantity);
        orderMan.persistOrder(order);
        orderLineMan.persistOrderLine(orderLine);
    }else {
        orderLine = new com.netbuilder.entities.OrderLine(order, product);
        orderLineMan.persistOrderLine(orderLine);
    }
}
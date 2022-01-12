public void placeOrder(final com.bartabs.ws.order.model.Order order) {
    java.lang.Long orderID = dao.placeOrder(order);
    java.util.List<com.bartabs.ws.menu.model.MenuItem> orderItems = order.getOrderItems();
    if ((orderItems != null) && (!(orderItems.isEmpty()))) {
        for (com.bartabs.ws.menu.model.MenuItem oi : orderItems) {
            dao.linkOrderItem(orderID, oi);
        }
    }
}
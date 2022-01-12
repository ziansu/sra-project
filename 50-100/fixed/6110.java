public java.lang.String duplicateOrder(fr.mgs.model.order.Order order) throws java.sql.SQLException {
    newOrder = new fr.mgs.model.order.Order();
    if (orderManager.hasNotValidatedOrder(userId)) {
        java.util.List<fr.mgs.model.order.Order> orderList = ((java.util.List<fr.mgs.model.order.Order>) (orderManager.findNotValidatedOrder(userId)));
        dupOrder = orderList.get(0);
    }
    updateNewOrder(order);
    updateCart();
    return "pretty:cstOrder";
}
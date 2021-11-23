public void saveOrder() throws java.sql.SQLException {
    currentOrder.getOrderLines().clear();
    for (fr.mgs.web.customer.StoreItem item : cart.values()) {
        fr.mgs.model.order.OrderLine orderLine = new fr.mgs.model.order.OrderLine();
        orderLine.setOrderLine(currentOrder, productManager.findProduct(item.getProductId()), item.getQuantity(), 0);
        currentOrder.addOrderLine(orderLine);
    }
    orderManager.updateOrder(currentOrder);
}
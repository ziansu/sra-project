public void cancelOrder(java.lang.Integer orderId) {
    com.uf.rest.entity.Order order = orderDao.findById(com.uf.rest.entity.Order.class, orderId);
    order.setOrderState(Constant.ORDER_STATE_CANCELED);
    orderDao.update(order);
}
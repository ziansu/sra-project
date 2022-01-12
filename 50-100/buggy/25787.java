@org.junit.Test(expected = java.lang.Exception.class)
public void negativeUpdateStatus() throws java.lang.Exception {
    try {
        com.foodybuddy.service.OrderService orderService = new com.foodybuddy.service.impl.OrderServiceImpl(com.foodybuddy.utils.SessionFactoryUtils.getSessionFactory());
        insertOrderUtil(orderService);
        int orderId = 1;
        com.foodybuddy.model.Order order = orderService.getOrder(orderId);
        orderService.updateOrderStatus(orderId, OrderStatusEnum.READY);
        orderService.updateOrderStatus(orderId, OrderStatusEnum.CANCELLED);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(ex);
        com.foodybuddy.service.OrderServiceTest.log.error(ex);
        throw ex;
    }
}
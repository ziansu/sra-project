@org.junit.Test(expected = java.lang.Exception.class)
public void negativeCancelOrderTest() throws java.lang.Exception {
    try {
        com.foodybuddy.service.OrderService orderService = new com.foodybuddy.service.impl.OrderServiceImpl(sessionFactory);
        insertOrderUtil(orderService);
        int orderId = -1;
        orderService.cancelOrder(orderId);
        com.foodybuddy.model.Order order = orderService.getOrder(orderId);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(ex);
        com.foodybuddy.service.OrderServiceTest.log.error(ex);
        throw ex;
    }
}
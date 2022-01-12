@org.junit.Test(expected = java.lang.Exception.class)
public void negativeInvalidCancelOrderTest() throws java.lang.Exception {
    try {
        com.foodybuddy.service.OrderService orderService = new com.foodybuddy.service.impl.OrderServiceImpl(com.foodybuddy.utils.SessionFactoryUtils.getSessionFactory());
        int orderId = 100;
        orderService.cancelOrder(orderId);
        com.foodybuddy.model.Order order = orderService.getOrder(orderId);
    } catch (java.lang.Exception ex) {
        com.foodybuddy.service.OrderServiceTest.log.error(ex);
        throw ex;
    }
}
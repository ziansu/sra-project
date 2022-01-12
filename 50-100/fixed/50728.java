@org.junit.Test
public void cancelOrderTest() {
    try {
        com.foodybuddy.service.OrderService orderService = new com.foodybuddy.service.impl.OrderServiceImpl(com.foodybuddy.utils.SessionFactoryUtils.getSessionFactory());
        insertOrderUtil(orderService);
        int orderId = 1;
        com.foodybuddy.model.Order order = orderService.getOrder(orderId);
        orderService.cancelOrder(orderId);
        order = orderService.getOrder(orderId);
        assertNotNull(order);
        assertEquals(order.getStatus(), OrderStatusEnum.CANCELLED.getValue());
    } catch (java.lang.Exception ex) {
        assertTrue(false);
        com.foodybuddy.service.OrderServiceTest.log.error(ex);
    }
}
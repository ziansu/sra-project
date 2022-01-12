@com.eclipsesource.restfuse.annotation.HttpTest(method = com.eclipsesource.restfuse.Method.GET, path = "/services/crud/order/1")
public void testGetOrder() throws java.lang.Exception {
    assertOk(response);
    assertEquals(MediaType.APPLICATION_XML, response.getType());
    osgi.jee.samples.rest.restbucks.model.Order order = getXMLUtil().fromXML(response.getBody());
    assertNotNull("Bad returned order", order);
    osgi.jee.samples.rest.restbucks.services.OrderManager orderService = getOrderManager();
    assertEquals("Bad returned order", orderService.getOrder("1"), order);
}
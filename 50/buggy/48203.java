public void testSetOrder() {
    com.qa.smurf.entities.Order order = new com.qa.smurf.entities.Order(1, null, null, null, null, null, null);
    lineItems.setOrder(order);
    assertEquals(order, lineItems.getOrder());
}
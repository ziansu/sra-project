@org.junit.Test
public void testSetDelivery_address() {
    address.setDelivery_address("2");
    assertEquals("2", address.getDelivery_address());
}
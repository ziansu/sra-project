@org.junit.Test
public void customerLocationLog1() throws asgn2Exceptions.CustomerException {
    double loc = java.lang.Math.abs(((cusRes.getCustomerByIndex(0).getLocationX()) + (java.lang.Math.abs(cusRes.getCustomerByIndex(0).getLocationY()))));
    assertEquals(cusRes.getCustomerByIndex(0).getDeliveryDistance(), loc);
}
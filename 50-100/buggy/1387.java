@org.junit.Test
public void customerLocationLog3() throws asgn2Exceptions.CustomerException, asgn2Exceptions.LogHandlerException, asgn2Exceptions.PizzaException {
    cusRes.processLog("C:\\Users\\You\\Documents\\PizzaParty\\asgn2\\logs\\20170103.txt");
    double loc = java.lang.Math.sqrt(((java.lang.Math.pow(cusRes.getCustomerByIndex(2).getLocationX(), 2)) + (java.lang.Math.pow(cusRes.getCustomerByIndex(2).getLocationY(), 2))));
    assertEquals(cusRes.getCustomerByIndex(2).getDeliveryDistance(), loc);
}
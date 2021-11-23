@org.junit.Test
public void testSetDataOfOrder() {
    java.util.Calendar myCal = java.util.Calendar.getInstance();
    myCal.set(java.util.Calendar.YEAR, 2040);
    myCal.set(java.util.Calendar.MONTH, 9);
    myCal.set(java.util.Calendar.DAY_OF_MONTH, 10);
    java.util.Date theDate = myCal.getTime();
    assertEquals(com.netbuilder.entities.CustomerOrderTest.test.getDateOfOrder(), theDate);
}
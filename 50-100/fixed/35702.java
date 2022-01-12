@org.junit.Test
public void checkGetDate() throws java.lang.InterruptedException, org.parse4j.ParseException {
    java.lang.String s = ((this.driverId) + (this.startDate)) + "1";
    org.junit.Assert.assertEquals(this.startDate, new logic.Order(s).getDate().toString());
    java.lang.Thread.sleep(6000);
}
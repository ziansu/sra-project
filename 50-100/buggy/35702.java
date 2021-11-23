@org.junit.Test
public void checkGetDate() throws java.lang.InterruptedException, org.parse4j.ParseException {
    java.lang.String s = ((this.driverId) + (this.startDate)) + "1";
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(this.start);
    java.text.SimpleDateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd");
    java.lang.String onlyDate = format1.format(cal.getTime());
    org.junit.Assert.assertEquals(onlyDate, new logic.Order(s).getDate().toString());
    java.lang.Thread.sleep(6000);
}
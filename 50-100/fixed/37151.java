@org.junit.Test
public void absoluteDay() {
    java.util.GregorianCalendar calendar = new java.util.GregorianCalendar(1900, 0, 1);
    assertEquals("Checking absolute day (1 Jan 1900)", 1, org.apache.poi.hssf.usermodel.HSSFDateUtil.absoluteDay(calendar, false));
    calendar = new java.util.GregorianCalendar(1901, 0, 1);
    assertEquals("Checking absolute day (1 Jan 1901)", 366, org.apache.poi.hssf.usermodel.HSSFDateUtil.absoluteDay(calendar, false));
}
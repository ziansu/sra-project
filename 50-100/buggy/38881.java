@org.junit.Test
public void testFormatDateFullMonthYear() {
    calendar.set(2014, java.util.Calendar.MARCH, 8);
    java.util.Date date = calendar.getTime();
    java.lang.String formatted = com.google.api.ads.adwords.awreporting.util.TemplateStringsUtil.formatDateFullMonthYear(date);
    junit.framework.Assert.assertEquals("March 2014", formatted);
    org.joda.time.DateTime dateTime = new org.joda.time.DateTime(2014, 3, 8, 0, 0);
    formatted = com.google.api.ads.adwords.awreporting.util.TemplateStringsUtil.formatDateFullMonthYear(dateTime);
}
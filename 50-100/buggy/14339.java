protected java.util.Calendar assertUTCDate(final java.util.Date date, final int year, final int month, final int day, final int hour, final int minute, final int second, final int millis) {
    final java.util.Calendar cal = assertUTCDate(date, year, month, day, hour, minute, second);
    org.testng.AssertJUnit.assertEquals(millis, cal.get(java.util.Calendar.MILLISECOND));
    return cal;
}
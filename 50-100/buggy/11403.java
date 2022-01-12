@org.junit.Test
public void shouldResetHour() {
    java.util.Date date = new java.util.Date();
    date = com.ondetemjogo.util.DateUtil.resetHour(date);
    java.util.Date newDate = com.ondetemjogo.util.DateUtil.resetHour(date);
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(newDate);
    org.junit.Assert.assertEquals(calendar.get(java.util.Calendar.HOUR_OF_DAY), 0);
}
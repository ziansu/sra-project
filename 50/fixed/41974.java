private java.util.Calendar convertToCalendar(org.joda.time.LocalDateTime date) {
    java.util.Date temp = date.toDate();
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(temp);
    return cal;
}
private java.util.Calendar convertToCalendar(org.joda.time.LocalDateTime date) {
    java.util.Date temp = date.toDate();
    java.util.Calendar cal = new java.util.GregorianCalendar();
    cal.setTime(temp);
    return cal;
}
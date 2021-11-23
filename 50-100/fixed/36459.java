private boolean isExpired(org.rootio.tools.radio.EventTime eventTime) {
    java.util.Calendar referenceCalendar = java.util.Calendar.getInstance();
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(eventTime.getScheduledDate());
    cal.add(java.util.Calendar.MINUTE, ((eventTime.getDuration()) - 1));
    return (cal.compareTo(referenceCalendar)) <= 0;
}
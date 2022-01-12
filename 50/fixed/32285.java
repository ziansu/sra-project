public org.joda.time.DateTime getSelectedDate() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(overviewController.getSelectedDate());
    return new org.joda.time.DateTime(cal);
}
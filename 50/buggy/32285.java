public org.joda.time.DateTime getSelectedMonth() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(overviewController.getSelectedDate());
    return new org.joda.time.DateTime(cal);
}
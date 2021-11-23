private void setEndDate(int newYear, int newMonth) {
    calendar = java.util.Calendar.getInstance();
    calendar.set(newYear, (newMonth - 1), calendar.getActualMaximum(java.util.Calendar.DATE));
    java.util.Date date = calendar.getTime();
    java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.FRANCE);
    endDate = DATE_FORMAT.format(date);
}
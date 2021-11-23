private void setTime(java.util.Calendar calendar) {
    setDate(calendar.get(java.util.Calendar.DAY_OF_MONTH), ((calendar.get(java.util.Calendar.MONTH)) + 1), calendar.get(java.util.Calendar.YEAR));
    setTime(calendar.get(java.util.Calendar.HOUR_OF_DAY), calendar.get(java.util.Calendar.MINUTE));
    timeChosen = java.util.Calendar.getInstance();
}
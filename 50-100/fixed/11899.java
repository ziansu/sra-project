private int getCurrentHour() {
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("kk", java.util.Locale.US);
    java.lang.String currentHours = simpleDateFormat.format(mCalendar.getTime());
    currentHours = (currentHours.startsWith("0")) ? currentHours.substring(1) : currentHours;
    return java.lang.Integer.valueOf(currentHours);
}
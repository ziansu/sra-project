private int getCurrentHour() {
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("kk", java.util.Locale.US);
    java.lang.String currentHours = simpleDateFormat.format(mCalendar.getTime());
    if (currentHours.contains("0")) {
        return java.lang.Integer.valueOf(currentHours.replace("0", ""));
    }else {
        return java.lang.Integer.valueOf(currentHours);
    }
}
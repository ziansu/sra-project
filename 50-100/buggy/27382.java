public static java.lang.String MITShortTimeOfDayString(java.util.Date date) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(date);
    java.text.SimpleDateFormat format = null;
    if ((cal.get(java.util.Calendar.MINUTE)) != 0) {
        format = new java.text.SimpleDateFormat("h:mma");
    }else {
        format = new java.text.SimpleDateFormat("ha");
    }
    return format.format(date);
}
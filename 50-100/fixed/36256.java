public static java.lang.String long2HMString(long time) {
    java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("HH:mm");
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.set(java.util.Calendar.HOUR_OF_DAY, 0);
    calendar.set(java.util.Calendar.MINUTE, 0);
    calendar.set(java.util.Calendar.SECOND, 0);
    calendar.set(java.util.Calendar.MILLISECOND, 0);
    calendar.add(java.util.Calendar.MILLISECOND, ((int) (time)));
    return df.format(calendar.getTime());
}
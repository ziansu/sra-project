public static java.util.Date getDate(int hr, int min) {
    java.util.Date date = new java.util.Date();
    DateTime.calendar.setTime(date);
    DateTime.calendar.set(java.util.Calendar.HOUR, 0);
    DateTime.calendar.set(java.util.Calendar.MINUTE, 0);
    DateTime.calendar.add(java.util.Calendar.HOUR_OF_DAY, hr);
    DateTime.calendar.add(java.util.Calendar.MINUTE, min);
    return DateTime.calendar.getTime();
}
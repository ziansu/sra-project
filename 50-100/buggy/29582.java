public static java.util.Calendar calendarForThisSaturdayEnd() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.add(java.util.Calendar.DAY_OF_WEEK, ((calendar.get(java.util.Calendar.DAY_OF_WEEK)) - (java.util.Calendar.SATURDAY)));
    calendar.set(java.util.Calendar.HOUR_OF_DAY, 23);
    calendar.set(java.util.Calendar.MINUTE, 59);
    calendar.set(java.util.Calendar.SECOND, 59);
    calendar.set(java.util.Calendar.MILLISECOND, 999);
    return calendar;
}
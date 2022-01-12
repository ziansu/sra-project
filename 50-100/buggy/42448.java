private static boolean isToday(java.util.Date date) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(date);
    java.util.Calendar now = java.util.Calendar.getInstance();
    return ((cal.get(java.util.Calendar.YEAR)) == (now.get(java.util.Calendar.YEAR))) && ((cal.get(java.util.Calendar.DAY_OF_YEAR)) == (now.get(java.util.Calendar.DAY_OF_YEAR)));
}
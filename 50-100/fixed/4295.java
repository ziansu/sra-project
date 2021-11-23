private boolean isSameDay(java.util.Date day1, java.util.Date day2) {
    java.util.Calendar cal1 = java.util.Calendar.getInstance();
    java.util.Calendar cal2 = java.util.Calendar.getInstance();
    cal1.setTime(day1);
    cal2.setTime(day2);
    return ((cal1.get(java.util.Calendar.YEAR)) == (cal2.get(java.util.Calendar.YEAR))) && ((cal1.get(java.util.Calendar.DAY_OF_YEAR)) == (cal2.get(java.util.Calendar.DAY_OF_YEAR)));
}
private static int getNumberOfWeeksOfYear(int year) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.set(java.util.Calendar.YEAR, year);
    c.set(java.util.Calendar.MONTH, java.util.Calendar.DECEMBER);
    c.set(java.util.Calendar.DAY_OF_MONTH, 31);
    int ordinalDay = c.get(java.util.Calendar.DAY_OF_YEAR);
    int weekDay = (c.get(java.util.Calendar.DAY_OF_WEEK)) - 1;
    return ((ordinalDay - weekDay) + 10) / 7;
}
private static long dateToMilLiseconds(int year, int month, int dayOfMonth, int hour, int minute, int second) {
    java.util.GregorianCalendar date = new java.util.GregorianCalendar(year, (month - 1), dayOfMonth, hour, minute, second);
    return date.getTimeInMillis();
}
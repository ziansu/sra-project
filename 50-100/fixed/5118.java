public static java.util.Date dateYS(int year, int month, int date, int hourOfDay, int minute, int second) {
    if (month < 1) {
        return null;
    }
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.set(year, (month - 1), date, hourOfDay, minute, second);
    return c.getTime();
}
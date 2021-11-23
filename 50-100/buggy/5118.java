public static java.util.Date dateYS(int year, int month, int date, int hourOfDay, int minute, int second) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.set(year, month, date, hourOfDay, minute, second);
    return c.getTime();
}
public static java.util.Calendar SQLDateStringToCalendar(java.lang.String sqlDateString) {
    java.lang.String[] splitDateString = sqlDateString.split("-");
    int year = java.lang.Integer.valueOf(splitDateString[0]);
    int month = java.lang.Integer.valueOf(splitDateString[1]);
    int day = java.lang.Integer.valueOf(splitDateString[2]);
    java.util.Calendar calendarDate = new java.util.GregorianCalendar(year, month, day);
    return calendarDate;
}
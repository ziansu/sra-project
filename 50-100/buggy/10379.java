public static java.sql.Date convertNewsApiDateStringToDate(java.lang.String date) {
    java.lang.String year = date.substring(0, 4);
    java.lang.String month = date.substring(5, 7);
    java.lang.String day = date.substring(8, 10);
    long timeInMilliSec = new java.util.GregorianCalendar(java.lang.Integer.parseInt(year), ((java.lang.Integer.parseInt(month)) - 1), java.lang.Integer.parseInt(day)).getTimeInMillis();
    return new java.sql.Date(timeInMilliSec);
}
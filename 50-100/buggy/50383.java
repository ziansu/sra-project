public static com.devsmart.Option create(java.lang.String symbol, java.util.Date expiration, double strike) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(expiration);
    int year = calendar.get(java.util.Calendar.YEAR);
    int month = calendar.get(java.util.Calendar.MONTH);
    int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    return com.devsmart.Option.create(symbol, strike, year, month, day);
}
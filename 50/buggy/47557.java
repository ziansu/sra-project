public static long normalizeDate(long startDate) {
    android.text.format.Time time = new android.text.format.Time();
    time.set(startDate);
    int julianDay = android.text.format.Time.getJulianDay(startDate, time.gmtoff);
    return time.setJulianDay(julianDay);
}
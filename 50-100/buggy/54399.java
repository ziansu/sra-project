public static java.util.Date getRandomDate(java.util.Date minDate, java.util.Date maxDate) {
    java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
    gc.setTime(minDate);
    int minDay = gc.get(java.util.GregorianCalendar.DAY_OF_YEAR);
    gc.setTime(maxDate);
    int maxDay = gc.get(java.util.GregorianCalendar.DAY_OF_YEAR);
    int rndDay = java.util.concurrent.ThreadLocalRandom.current().nextInt(minDay, maxDay);
    gc.set(java.util.GregorianCalendar.DAY_OF_YEAR, rndDay);
    return gc.getTime();
}
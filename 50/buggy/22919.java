public static long getDateDiff(java.util.Date date1, java.util.Date date2, java.util.concurrent.TimeUnit timeUnit) {
    long diffInMillies = (date2.getTime()) - (date1.getTime());
    return timeUnit.convert(diffInMillies, java.util.concurrent.TimeUnit.MILLISECONDS);
}
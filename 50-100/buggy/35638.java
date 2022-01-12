protected long nextMaxInterval(long attempt, java.util.Date end) {
    long interval = (period) * ((long) (java.lang.Math.pow(attempt, 1.5)));
    interval = (interval > (maxPeriod)) ? maxPeriod : interval;
    long max = (end.getTime()) - (java.lang.System.currentTimeMillis());
    return interval > max ? max : interval;
}
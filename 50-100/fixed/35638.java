protected long nextMaxInterval(long attempt, java.util.Date end) {
    long interval = ((long) ((period) * (java.lang.Math.pow(1.5, (attempt - 1)))));
    interval = (interval > (maxPeriod)) ? maxPeriod : interval;
    long max = (end.getTime()) - (java.lang.System.currentTimeMillis());
    return interval > max ? max : interval;
}
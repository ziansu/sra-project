private boolean isExpired(java.util.Date date) {
    return ((java.lang.System.currentTimeMillis()) - (date.getTime())) >= (java.util.concurrent.TimeUnit.MILLISECONDS.convert(recordTimeOut, timeUnit));
}
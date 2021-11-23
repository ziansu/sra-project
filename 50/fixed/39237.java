public long minutesSinceLastUse() {
    return java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(((new java.util.Date().getTime()) - (lastUse.getTime())));
}
public long minutesSinceLastUse() {
    return java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(((lastUse.getTime()) - (creation.getTime())));
}
public long getDaysAgo() {
    final int millisecondsInDay = ((1000 * 60) * 60) * 24;
    long createDay = (activity.getCreateDate()) / millisecondsInDay;
    long daysNow = (new java.util.Date().getTime()) / millisecondsInDay;
    return daysNow - createDay;
}
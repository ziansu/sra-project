private long millisSinceMidnight(final long now) {
    if (now >= (midnightTomorrow)) {
        midnightToday = calcMidnightMillis(0);
        midnightTomorrow = calcMidnightMillis(1);
    }
    return now - (midnightToday);
}
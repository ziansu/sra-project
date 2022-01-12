private long millisSinceMidnight(final long now) {
    if (now >= (midnightTomorrow)) {
        midnightToday = calcMidnightMillis(now, 0);
        midnightTomorrow = calcMidnightMillis(now, 1);
    }
    return now - (midnightToday);
}
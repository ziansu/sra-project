private boolean isDaytime() {
    int tStart = getDaytimeStart();
    int tEnd = getDaytimeEnd();
    if (tEnd <= tStart) {
        tEnd += 2400;
    }
    assert tEnd > tStart;
    java.util.Calendar now = java.util.Calendar.getInstance();
    int currentHour = now.get(java.util.Calendar.HOUR_OF_DAY);
    int currentMinute = now.get(java.util.Calendar.MINUTE);
    int currentTime = (100 * currentHour) + currentMinute;
    return (tStart <= currentTime) && (currentTime < tEnd);
}
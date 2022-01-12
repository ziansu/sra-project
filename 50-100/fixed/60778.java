private boolean isDaytime() {
    int tStart = getDaytimeStart();
    int tEnd = getDaytimeEnd();
    java.util.Calendar now = java.util.Calendar.getInstance();
    int currentHour = now.get(java.util.Calendar.HOUR_OF_DAY);
    int currentMinute = now.get(java.util.Calendar.MINUTE);
    int currentTime = (100 * currentHour) + currentMinute;
    if (tStart < tEnd) {
        return (tStart <= currentTime) && (currentTime < tEnd);
    }else {
        return (currentTime <= tEnd) || (tStart <= currentTime);
    }
}
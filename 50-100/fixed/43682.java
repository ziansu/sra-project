private static long getTodayTime() {
    java.util.Calendar today = java.util.Calendar.getInstance();
    today.set(java.util.Calendar.HOUR_OF_DAY, 0);
    today.set(java.util.Calendar.MINUTE, 0);
    today.set(java.util.Calendar.SECOND, 0);
    long time = today.getTimeInMillis();
    return time;
}
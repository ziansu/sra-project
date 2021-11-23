private boolean isTimeout(long startTimeInMillis, long timeoutInMillis) {
    long currentTimeInMillis = java.lang.System.currentTimeMillis();
    return (startTimeInMillis + timeoutInMillis) >= currentTimeInMillis;
}
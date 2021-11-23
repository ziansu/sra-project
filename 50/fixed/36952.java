private long getStartTimeInMillis() {
    long currTime = java.lang.System.currentTimeMillis();
    long startTime = currTime + (((java.lang.Integer) (hourSpinner.getValue())) * 3600000);
    return startTime;
}
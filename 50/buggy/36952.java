private long getStartTimeInMillis() {
    long currTime = java.lang.System.currentTimeMillis();
    long startTime = currTime + (((java.lang.Integer) (hourSpinner.getValue())) * 3600000);
    java.lang.System.out.println(("startTime: " + startTime));
    return startTime;
}
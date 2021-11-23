long getDuration() {
    short milliToSecsFactor = 1000;
    endTime = java.lang.System.currentTimeMillis();
    long time = (endTime) - (startTime);
    return time;
}
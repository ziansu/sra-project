private long getTotalTime() {
    java.util.Date stopTime = new java.util.Date();
    return (stopTime.getTime()) - (startTime.getTime());
}
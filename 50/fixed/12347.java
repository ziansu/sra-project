public boolean setStartTime(java.time.ZonedDateTime startTime) {
    if (((endTime) == null) || (startTime.isBefore(endTime))) {
        this.startTime = startTime;
        return true;
    }
    return false;
}
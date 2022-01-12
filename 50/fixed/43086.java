public boolean setEndTime(java.time.ZonedDateTime endTime) {
    if (((startTime) == null) || (endTime.isAfter(startTime))) {
        this.endTime = endTime;
        return true;
    }
    return false;
}
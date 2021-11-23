public boolean setEndTime(java.time.ZonedDateTime endTime) {
    if (endTime.isAfter(this.startTime)) {
        this.endTime = endTime;
        return true;
    }
    return false;
}
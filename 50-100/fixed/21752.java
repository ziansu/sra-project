public void addInterval(java.time.LocalDateTime start, java.time.LocalDateTime stop) {
    long useLastInterval = 0;
    if (((this._previousStopTime) != null) && (this._previousStopTime.isEqual(start))) {
        useLastInterval = this._previousIntervalInSeconds;
    }
    long playTimeInSeconds = (stop.toEpochSecond(java.time.ZoneOffset.UTC)) - (start.toEpochSecond(java.time.ZoneOffset.UTC));
    rememberStartTime(start);
    rememberStopTime(stop);
    rememberInterval(useLastInterval, playTimeInSeconds);
    this._totalPlayTimeInSeconds += playTimeInSeconds;
}
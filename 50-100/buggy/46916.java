protected boolean isLastAisTrackingReportTooOld(dk.dma.ais.abnormal.tracker.Track track, long now) {
    if ((trackPredictionTimeMax) == (-1)) {
        return false;
    }
    final long timeOfLastAisTrackingReport = track.getTimeOfLastAisTrackingReport();
    return (timeOfLastAisTrackingReport != (-1)) && ((now - timeOfLastAisTrackingReport) > (((trackPredictionTimeMax) * 60) * 1000));
}
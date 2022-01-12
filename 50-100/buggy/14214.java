private java.lang.Long getTimestampPosition(java.lang.Long timestamp) {
    long nbToStart = 0;
    if ((timestamp != null) && (timestamp > (t0))) {
        nbToStart = (timestamp - (t0)) / (step);
    }
    long startIdx = ((nbToStart * (getRecordLen())) + (com.mireau.timeseries.ArchiveDataSerie.HEADER1_LEN)) + (currentStepDataLength());
    return startIdx;
}
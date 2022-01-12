private org.mrgeo.data.vector.geowave.TemporalConstraints getTemporalConstraints(java.util.Date startTime, java.util.Date endTime) {
    org.mrgeo.data.vector.geowave.TemporalRange tr = new org.mrgeo.data.vector.geowave.TemporalRange();
    if (startTime != null) {
        tr.setStartTime(startTime);
    }
    if (endTime != null) {
        tr.setEndTime(endTime);
    }
    org.mrgeo.data.vector.geowave.TemporalConstraints tc = new org.mrgeo.data.vector.geowave.TemporalConstraints();
    tc.add(tr);
    return tc;
}
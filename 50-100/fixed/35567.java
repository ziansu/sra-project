public io.druid.segment.realtime.FireDepartmentMetrics getMetrics(java.lang.String datasource) {
    java.util.Map<java.lang.Integer, io.druid.segment.realtime.RealtimeManager.FireChief> chiefs = this.chiefs.get(datasource);
    if (chiefs == null) {
        return null;
    }
    io.druid.segment.realtime.FireDepartmentMetrics snapshot = null;
    for (io.druid.segment.realtime.RealtimeManager.FireChief chief : chiefs.values()) {
        if (snapshot == null) {
            snapshot = chief.getMetrics().snapshot();
        }else {
            snapshot.merge(chief.getMetrics());
        }
    }
    return snapshot;
}
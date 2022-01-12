private void init() {
    for (org.appdynamics.appdrestapi.data.MetricValues values : metricData.values()) {
        if (values == null)
            continue;
        
        for (org.appdynamics.appdrestapi.data.MetricValue mv : values.getMetricValue()) {
            timestampSet.add(mv.getStartTimeInMillis());
        }
    }
    timestamps = timestampSet.toArray(new java.lang.Long[0]);
    java.util.Arrays.sort(timestamps);
    initialized = true;
}
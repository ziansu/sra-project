private synchronized void scheduleRemoteMeasure(org.measure.platform.core.entity.MeasureInstance measure) {
    java.util.List<java.lang.Long> measures = this.remotsJobs.get(measure.getRemoteLabel());
    if (measures == null) {
        measures = new java.util.ArrayList<>();
        this.remotsJobs.put(measure.getRemoteLabel(), measures);
    }
    measures.add(measure.getId());
}
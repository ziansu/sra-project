public metrics_influxdb.measurements.Measure timePrecision(java.util.concurrent.TimeUnit precision) {
    if (((precision != (java.util.concurrent.TimeUnit.SECONDS)) && (precision != (java.util.concurrent.TimeUnit.MILLISECONDS))) && (precision != (java.util.concurrent.TimeUnit.MICROSECONDS))) {
        metrics_influxdb.measurements.Measure.LOGGER.error("time precision can be only set to SECONDS, MILLISECONDS or MICROSECONDS");
        return null;
    }
    this.timePrecision = precision;
    return this;
}
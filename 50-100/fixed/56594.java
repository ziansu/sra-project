public java.lang.String lineProtocol(com.izettle.metrics.influxdb.data.InfluxDbPoint point, java.util.concurrent.TimeUnit precision) {
    return (((escapeKey(point.getMeasurement())) + (concatenatedTags(point.getTags()))) + (concatenateFields(point.getFields()))) + (formattedTime(point.getTime(), precision));
}
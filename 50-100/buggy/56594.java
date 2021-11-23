public java.lang.String lineProtocol(com.izettle.metrics.influxdb.data.InfluxDbPoint point, java.util.concurrent.TimeUnit precision) {
    final java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(escapeKey(point.getMeasurement()));
    sb.append(concatenatedTags(point.getTags()));
    sb.append(concatenateFields(point.getFields()));
    sb.append(formattedTime(point.getTime(), precision));
    return sb.toString();
}
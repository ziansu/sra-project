@java.lang.Override
public long extractTimestamp(org.apache.flink.api.java.tuple.Tuple5<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String> element, long previousElementTimestamp) {
    long millis = org.joda.time.format.DateTimeFormat.forPattern("yyyyMMddHHmmss").parseDateTime(element.f3).getMillis();
    maxTimestamp = java.lang.Math.max(maxTimestamp, (millis - 5000));
    return millis;
}
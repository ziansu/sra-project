@java.lang.Override
public org.apache.flink.streaming.api.watermark.Watermark checkAndGetNextWatermark(org.apache.flink.api.java.tuple.Tuple2<java.lang.Long, java.lang.Integer> lastElement, long extractedTimestamp) {
    return ((lastElement.f0) == (-1)) || (extractedTimestamp == (-1L)) ? new org.apache.flink.streaming.api.watermark.Watermark(extractedTimestamp) : null;
}
public boolean track(org.apache.storm.generated.GlobalStreamId stream, long ts) {
    java.lang.Long currentVal = streamToTs.get(stream);
    if ((currentVal == null) || (ts > currentVal)) {
        streamToTs.put(stream, ts);
    }
    checkFailures();
    return ts >= (lastWaterMarkTs);
}
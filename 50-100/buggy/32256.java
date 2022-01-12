public void addDataPoint(long timestamp, long value) throws com.srotya.sidewinder.core.storage.RejectException {
    synchronized(output) {
        if (timestamp < (lastTs)) {
            throw com.srotya.sidewinder.core.storage.gorilla.TimeSeriesBucket.OLD_DATA_POINT;
        }
        writer.addValue(timestamp, value);
        (count)++;
        lastTs = timestamp;
    }
}
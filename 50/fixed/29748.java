@java.lang.Override
public void addValue(long timestamp, long value) throws java.io.IOException {
    try {
        write.lock();
        writeDataPoint(timestamp, value);
    } finally {
        write.unlock();
    }
}
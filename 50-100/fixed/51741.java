@java.lang.Override
public void set(org.springframework.boot.actuate.metrics.Metric<?> value) {
    org.springframework.boot.actuate.metrics.opentsdb.OpenTsdbData data = new org.springframework.boot.actuate.metrics.opentsdb.OpenTsdbData(this.namingStrategy.getName(value.getName()), value.getValue(), value.getTimestamp().getTime());
    synchronized(this.buffer) {
        this.buffer.add(data);
        if ((this.buffer.size()) >= (this.bufferSize)) {
            flush();
        }
    }
}
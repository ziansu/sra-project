public void disable() {
    this.warn("Disabling client library");
    synchronized(this.mutex) {
        this.timer.cancel();
        this.timer.purge();
        if ((this.transport) != null) {
            this.transport.close();
            this.transport = null;
        }
        this.isDisabled = true;
        this.spans = new java.util.ArrayList<com.lightstep.tracer.thrift.SpanRecord>(0);
    }
}
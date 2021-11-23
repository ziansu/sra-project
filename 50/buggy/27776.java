private void incrementReportEntity(final java.util.concurrent.atomic.AtomicLong entity) {
    if ((this.traceExecution) || (this.enableCounters)) {
        entity.incrementAndGet();
    }
}
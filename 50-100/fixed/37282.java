private boolean exceedingThroughput() {
    long transactions;
    long timeLapse;
    long throughput;
    transactions = ((counters.write.writeCount.get()) + (counters.write.mappingWriteCount.get())) + (counters.write.writeErrors.get());
    timeLapse = ((java.lang.System.currentTimeMillis()) - (counters.write.writeStartTime)) / 1000L;
    if (timeLapse > 0) {
        throughput = transactions / timeLapse;
        if (throughput > (params.maxThroughput)) {
            return true;
        }
    }
    return false;
}
@java.lang.Override
public void close() {
    org.magicdgs.thaplv.tools.ld.engine.QueueLD.logger.debug("Computing QueueLD when close");
    while (!(snpQueue.isEmpty())) {
        computeQueueLD();
    } 
    writeBins();
    if ((executor) != null) {
        org.magicdgs.thaplv.tools.ld.engine.QueueLD.logger.debug("Shutdown the executor");
        executor.shutdown();
    }
    output.close();
    monitorLogging();
}
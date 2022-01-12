public void run() {
    org.apache.synapse.messageflowtracer.data.MessageFlowDataEntry mediationDataEntry;
    while ((!(isStopped)) && (!(org.apache.synapse.messageflowtracer.processors.MessageFlowTracingDataCollector.isEmpty()))) {
        try {
            mediationDataEntry = org.apache.synapse.messageflowtracer.processors.MessageFlowTracingDataCollector.deQueue();
            mediationDataEntry.process();
        } catch (java.lang.Exception exception) {
            org.apache.synapse.messageflowtracer.processors.MessageFlowTracingDataConsumer.log.error("Error in Mediation Tracing data consumer while consuming data", exception);
        }
    } 
}
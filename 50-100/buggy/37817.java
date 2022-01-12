public void run() {
    org.apache.synapse.aspects.flow.statistics.log.StatisticsReportingEventHolder statisticsReportingEventHolder;
    while (!(shutdownRequested)) {
        try {
            statisticsReportingEventHolder = synapseEnvironmentService.getSynapseEnvironment().getMessageDataStore().dequeue();
            if (statisticsReportingEventHolder != null) {
                processAndPublishEventList(statisticsReportingEventHolder.getEventList());
            }else {
                delay();
            }
        } catch (java.lang.Exception exception) {
            org.wso2.carbon.das.messageflow.data.publisher.services.MessageFlowReporterThread.log.error("Error in mediation flow statistic data consumer while consuming data", exception);
        }
    } 
}
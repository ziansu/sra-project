public void onSuccess(java.util.Set<java.lang.String> queueNames) {
    if ((queueNames != null) && (!(queueNames.isEmpty()))) {
        try {
            java.util.Map<java.lang.String, java.lang.String> queueStats = azureServiceBusStatsCollector.collectQueueStats(azure, namespaceName, queueNames, namespace.getQueueStats(), config.getQueueThreads());
            printMetrics(queueStats, metricPrefix);
        } catch (com.singularity.ee.agent.systemagent.api.exception.TaskExecutionException e) {
            com.appdynamics.monitors.azure.AzureServiceBusMonitor.logger.error(("Unable to get queue stats for namespace [" + namespaceName), e);
        }
    }
}
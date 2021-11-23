public void onSuccess(java.util.Set<java.lang.String> queueNames) {
    if ((queueNames != null) && (!(queueNames.isEmpty()))) {
        try {
            azureServiceBusStatsCollector.collectQueueStats(azure, namespaceName, queueNames, namespace.getQueueStats(), config.getQueueThreads());
        } catch (com.singularity.ee.agent.systemagent.api.exception.TaskExecutionException e) {
            com.appdynamics.monitors.azure.AzureServiceBusMonitor.logger.error(("Unable to get queue stats for namespace [" + namespaceName), e);
        }
    }
}
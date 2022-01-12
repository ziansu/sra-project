private com.hazelcast.core.ICompletableFuture<java.lang.Object> invokeOnNextPartition() throws java.lang.Exception {
    int partitionId = nextPartitionId();
    if (isClient) {
        com.hazelcast.simulator.tests.synthetic.SyntheticRequest request = new com.hazelcast.simulator.tests.synthetic.SyntheticRequest(syncBackupCount, asyncBackupCount, backupDelayNanos, null);
        request.setLocalPartitionId(partitionId);
        com.hazelcast.nio.Address target = clientPartitionService.getPartitionOwner(partitionId);
        return clientInvocationService.invokeOnTarget(request, target);
    }
    com.hazelcast.simulator.tests.synthetic.SyntheticOperation operation = new com.hazelcast.simulator.tests.synthetic.SyntheticOperation(syncBackupCount, asyncBackupCount, getBackupDelayNanos());
    return operationService.invokeOnPartition(serviceName, operation, partitionId);
}
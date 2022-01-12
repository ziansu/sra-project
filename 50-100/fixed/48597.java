private com.emc.storageos.coordinator.client.model.DbConsistencyStatus markResult() {
    com.emc.storageos.coordinator.client.model.DbConsistencyStatus status = dbChecker.getStatusFromZk();
    if ((status.getInconsistencyCount()) > 0) {
        com.emc.storageos.systemservices.impl.jobs.consumer.DbConsistencyJobConsumer.log.info("there are {} inconsistency found, mark result as fail", status.getInconsistencyCount());
        status.markResult(Status.FAILED);
    }else {
        com.emc.storageos.systemservices.impl.jobs.consumer.DbConsistencyJobConsumer.log.info("no inconsistency record found, mark result as successful");
        status.markResult(Status.SUCCESS);
    }
    return status;
}
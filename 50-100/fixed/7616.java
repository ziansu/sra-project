public void saveJobInfo(com.emc.sa.api.utils.OrderJobStatus status) throws java.lang.Exception {
    org.apache.curator.framework.recipes.locks.InterProcessLock lock = coordinatorClient.getLock(com.emc.sa.api.OrderService.ORDER_JOB_LOCK);
    lock.acquire();
    coordinatorClient.persistRuntimeState(status.getType().name(), status);
    lock.release();
}
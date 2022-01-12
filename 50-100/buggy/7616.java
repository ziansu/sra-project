public void saveJobInfo(com.emc.sa.api.utils.OrderJobStatus status) throws java.lang.Exception {
    com.emc.sa.api.OrderService.log.info("lbyx0: persist type={}", status);
    org.apache.curator.framework.recipes.locks.InterProcessLock lock = coordinatorClient.getLock(com.emc.sa.api.OrderService.ORDER_JOB_LOCK);
    lock.acquire();
    coordinatorClient.persistRuntimeState(status.getType().name(), status);
    lock.release();
}
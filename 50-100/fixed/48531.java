static synchronized nna.base.util.concurrent.WorkerManager initWorkerManager(java.lang.Long maxBusinessProcessTime, java.lang.Long thresholdTime) {
    if (nna.base.util.concurrent.WorkerManager.init) {
        return nna.base.util.concurrent.WorkerManager.workerManager;
    }
    nna.base.util.concurrent.WorkerManager.init = true;
    int workCount = nna.base.util.concurrent.WorkerManager.getAvlCPUCount();
    if ((maxBusinessProcessTime != null) && (thresholdTime != null)) {
        int count = nna.base.util.concurrent.WorkerManager.getBusinessCount(maxBusinessProcessTime, thresholdTime);
        workCount = java.lang.Math.max(count, workCount);
    }
    nna.base.util.concurrent.WorkerManager.workerManager = new nna.base.util.concurrent.WorkerManager(workCount);
    return nna.base.util.concurrent.WorkerManager.workerManager;
}
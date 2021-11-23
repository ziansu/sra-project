private void init(int workerCount, nna.base.util.concurrent.Worker worker) {
    fixedLogWorkerService = java.util.concurrent.Executors.newFixedThreadPool(workerCount);
    nna.base.util.concurrent.Worker tempWorker;
    for (int index = 0; index < workerCount; index++) {
        tempWorker = ((nna.base.util.concurrent.Worker) (worker.clone()));
        tempWorker.setLoadNo(index);
        balancedWorkerList.add(tempWorker);
        fixedLogWorkerService.submit(tempWorker);
    }
}
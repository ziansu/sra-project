public void restartTopology() {
    for (com.twitter.heron.scheduler.yarn.HeronMasterDriver.HeronWorker worker : multiKeyWorkerMap.getHeronWorkers()) {
        restartWorker(worker.workerId);
    }
}
public void run() throws java.lang.InterruptedException, java.util.concurrent.BrokenBarrierException {
    boolean isTermination;
    After3level(0);
    sharedDataObject.setCurrentBFSLevel(4);
    while (true) {
        isTermination = runWorkerOnce(workTasks);
        if (isTermination) {
            break;
        }
        runBarrierOnce(barrierTasks);
        barriers.await();
        sharedDataObject.incrementBFSLevel();
        java.lang.System.out.println(("LEVEL : " + (sharedDataObject.getCurrentBFSLevel())));
    } 
}
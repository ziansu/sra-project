public void resumeJob(space.SpaceImpl space) {
    for (java.lang.Long key : this.shadow.keySet()) {
        try {
            synchronized(this.readyQueue) {
                this.readyQueue.put(this.shadow.get(key));
            }
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
    for (system.Computer computer : this.computerList) {
        system.ComputerProxy computerProxy = new system.ComputerProxy(space, computer, this.jobId, this.lock);
        computerProxy.startWorker();
    }
}
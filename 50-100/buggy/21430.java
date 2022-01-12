public void startWorker() {
    try {
        int workerNo = this.computer.getWorkerNo();
        for (int i = 0; i < workerNo; i++)
            new system.WorkerProxy(this.space, this.computer, this.proxyId, this.jobId, this.lock).start();
        
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
    }
}
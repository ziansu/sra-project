@java.lang.Override
public void run() {
    synchronized(this.jobContext.shadow) {
        synchronized(this.jobContext.waitingQueue) {
            synchronized(this.jobContext.readyQueue) {
                try {
                    this.mirror.checkPoint(this.jobContext, jobId);
                    java.lang.System.out.println("Checkpoint!");
                } catch (java.rmi.RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
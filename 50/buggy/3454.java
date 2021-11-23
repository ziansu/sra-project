public final void interruptWorker() {
    final org.jacpfx.rcp.worker.AEmbeddedComponentWorker worker = this.workerRef.get();
    if (worker == null)
        return ;
    
    if (worker.isAlive()) {
        worker.interrupt();
    }
    worker.cleanAfterInterrupt();
}
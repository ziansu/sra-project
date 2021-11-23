public final void initWorker(final org.jacpfx.rcp.worker.AEmbeddedComponentWorker worker) {
    this.workerRef.set(worker);
    worker.start();
}
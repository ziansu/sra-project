public boolean isVirtualWorker() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.isVirtualWorker" + (getWorker())));
    boolean isVirtual = false;
    if ((this.workerModel) != null) {
        if ((this.workerModel.getWorker()) != null) {
            isVirtual = this.workerModel.getWorker().isVirtual();
        }
    }
    return isVirtual;
}
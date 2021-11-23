public boolean isUserSelected() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.isUserSelected" + (getWorker())));
    return (userBandbox.getSelectedElement()) != null;
}
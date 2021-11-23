public void saveAndExit() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.saveAndExit" + (getWorker())));
    if (save()) {
        goToList();
    }
}
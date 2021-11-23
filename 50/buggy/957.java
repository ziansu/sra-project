private void setupCriterionsController() throws java.lang.Exception {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.setupCriterionsController" + (getWorker())));
    criterionsController = new org.libreplan.web.resources.worker.CriterionsController(workerModel);
    criterionsController.doAfterCompose(getCurrentWindow().getFellow("criterionsContainer"));
}
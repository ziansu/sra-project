public org.libreplan.business.users.entities.User getBoundUser() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getBoundUser" + (getWorker())));
    return workerModel.getBoundUser();
}
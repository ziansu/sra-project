public java.lang.Object getLimitingResource() {
    final org.libreplan.business.resources.entities.Worker worker = getWorker();
    return worker != null ? org.libreplan.web.resources.worker.WorkerCRUDController.LimitingResourceEnum.valueOf(worker.isLimitingResource()) : org.libreplan.web.resources.worker.WorkerCRUDController.LimitingResourceEnum.NON_LIMITING_RESOURCE;
}
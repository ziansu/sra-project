public void setLimitingResource(org.libreplan.web.resources.worker.WorkerCRUDController.LimitingResourceEnum option) {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.setLimitingResource" + (getWorker())));
    org.libreplan.business.resources.entities.Worker worker = getWorker();
    if (worker != null) {
        worker.setResourceType(org.libreplan.web.resources.worker.WorkerCRUDController.LimitingResourceEnum.toResourceType(option));
        if (worker.isLimitingResource()) {
            worker.setUser(null);
        }
        org.libreplan.web.common.Util.reloadBindings(userBindingGroupbox);
    }
}
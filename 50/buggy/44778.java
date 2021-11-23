public void updateUserBindingView() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.updateUserBindingView" + (getWorker())));
    org.libreplan.web.common.Util.reloadBindings(userBindingGroupbox);
}
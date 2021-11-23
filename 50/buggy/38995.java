public boolean isCreateNewUser() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.isCreateNewUser" + (getWorker())));
    int option = userBindingRadiogroup.getSelectedIndex();
    return (org.libreplan.web.resources.worker.WorkerCRUDController.UserBindingOption.CREATE_NEW_USER.ordinal()) == option;
}
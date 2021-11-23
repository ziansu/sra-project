public boolean isCreateNewUser() {
    int option = userBindingRadiogroup.getSelectedIndex();
    return (org.libreplan.web.resources.worker.WorkerCRUDController.UserBindingOption.CREATE_NEW_USER.ordinal()) == option;
}
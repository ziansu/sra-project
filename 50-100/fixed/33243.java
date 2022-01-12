private void updateUserBindingComponents() {
    org.libreplan.business.users.entities.User user = getBoundUser();
    if (user == null) {
        userBindingRadiogroup.setSelectedIndex(org.libreplan.web.resources.worker.WorkerCRUDController.UserBindingOption.NOT_BOUND.ordinal());
    }else {
        userBindingRadiogroup.setSelectedIndex(org.libreplan.web.resources.worker.WorkerCRUDController.UserBindingOption.EXISTING_USER.ordinal());
    }
    loginNameTextbox.setValue("");
    emailTextbox.setValue("");
    passwordTextbox.setValue("");
    passwordConfirmationTextbox.setValue("");
    org.libreplan.web.common.Util.reloadBindings(userBindingGroupbox);
}
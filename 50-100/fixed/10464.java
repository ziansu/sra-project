public void doSave() {
    java.lang.System.out.println("CRMController.doSave()");
    view.clearFieldErrors();
    try {
        validateForm();
        view.formToBean(model.getCurrentBean());
        this.getModel().doSave();
        currentBeanIsNew = false;
        view.disableEditMode();
        this.refreshView(controllers.CRMController.emptyErrors);
        view.setMessagesLabel("Record Saved Successfully");
    } catch (exceptions.InvalidFormFieldData e) {
        this.refreshView(controllers.CRMController.emptyErrors);
    }
}
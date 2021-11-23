@java.lang.Override
public void goToCreateForm() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.goToCreateForm" + (getWorker())));
    state = org.libreplan.web.common.BaseCRUDController.CRUDControllerState.CREATE;
    getBookmarker().goToCreateForm();
    workerModel.prepareForCreate();
    createAsignedCriterions();
    resourcesCostCategoryAssignmentController.setResource(workerModel.getWorker());
    updateUserBindingComponents();
    showEditWindow(org.libreplan.web.I18nHelper._("Create Worker"));
    resourceCalendarModel.cancel();
    org.zkoss.zul.Textbox workerFirstname = ((org.zkoss.zul.Textbox) (editWindow.getFellow("workerFirstname")));
    workerFirstname.focus();
}
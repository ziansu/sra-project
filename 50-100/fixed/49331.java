public void goToEditVirtualWorkerForm(org.libreplan.business.resources.entities.Worker worker) {
    state = org.libreplan.web.common.BaseCRUDController.CRUDControllerState.EDIT;
    workerModel.prepareEditFor(worker);
    resourcesCostCategoryAssignmentController.setResource(workerModel.getWorker());
    if (isCalendarNotNull()) {
        editCalendar();
    }
    editAsignedCriterions();
    showEditWindow(org.libreplan.web.I18nHelper._("Edit Virtual Workers Group: {0}", worker.getHumanId()));
}
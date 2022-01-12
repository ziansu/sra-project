private void validateConstraints() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.validateConstraints" + (getWorker())));
    org.zkoss.zul.Tab selectedTab = personalDataTab;
    try {
        validatePersonalDataTab();
        selectedTab = assignedCriteriaTab;
        validateAssignedCriteriaTab();
        selectedTab = costCategoryAssignmentTab;
        validateCostCategoryAssigmentTab();
    } catch (org.zkoss.zk.ui.WrongValueException e) {
        selectedTab.setSelected(true);
        throw e;
    }
}
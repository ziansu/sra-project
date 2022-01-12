private void initializeTabs() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.initializeTabs" + (getWorker())));
    personalDataTab = ((org.zkoss.zul.Tab) (editWindow.getFellow("personalDataTab")));
    assignedCriteriaTab = ((org.zkoss.zul.Tab) (editWindow.getFellow("assignedCriteriaTab")));
    costCategoryAssignmentTab = ((org.zkoss.zul.Tab) (editWindow.getFellow("costCategoryAssignmentTab")));
}
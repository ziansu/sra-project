private void showEditWindow(java.lang.String title) {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.showEditWindow" + (getWorker())));
    personalDataTab.setSelected(true);
    ((org.zkoss.zul.api.Caption) (editWindow.getFellow("caption"))).setLabel(title);
    getVisibility().showOnly(editWindow);
    org.libreplan.web.common.Util.reloadBindings(editWindow);
}
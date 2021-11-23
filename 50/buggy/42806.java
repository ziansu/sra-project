@java.lang.Override
public void goToList() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.goToList" + (getWorker())));
    state = org.libreplan.web.common.BaseCRUDController.CRUDControllerState.LIST;
    getVisibility().showOnly(listWindow);
    org.libreplan.web.common.Util.reloadBindings(listWindow);
}
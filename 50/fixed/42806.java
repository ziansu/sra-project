@java.lang.Override
public void goToList() {
    state = org.libreplan.web.common.BaseCRUDController.CRUDControllerState.LIST;
    getVisibility().showOnly(listWindow);
    org.libreplan.web.common.Util.reloadBindings(listWindow);
}
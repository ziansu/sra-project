private org.oscm.ui.common.ServiceAccess getServiceAccess() {
    if ((serviceAccess) == null) {
        serviceAccess = new org.oscm.ui.common.EJBServiceAccess();
    }
    return serviceAccess;
}
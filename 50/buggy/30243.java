private org.oscm.ui.common.ServiceAccess getServiceAccess() {
    if ((serviceAccess) != null) {
        return serviceAccess;
    }
    return new org.oscm.ui.common.EJBServiceAccess();
}
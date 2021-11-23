public java.lang.String getInitialize() {
    org.oscm.app.ui.serviceinstance.ManageServiceInstanceModel model = getModel();
    try {
        if (model == null) {
            model = new org.oscm.app.ui.serviceinstance.ManageServiceInstanceModel();
        }
        if (!(model.isInitialized())) {
            model.setServiceInstanceRows(initServiceInstanceRows());
            model.setInitialized(true);
            model.setTimePattern(org.oscm.app.ui.serviceinstance.TIME_PATTERN);
            model.setLoggedInUserId(initLoggedInUserId());
            setModel(model);
        }
    } catch (org.oscm.app.business.exceptions.ServiceInstanceException | java.lang.IllegalArgumentException e) {
        addError(e);
    }
    return "";
}
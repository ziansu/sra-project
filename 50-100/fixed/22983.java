@java.lang.Override
public com.capitalone.dashboard.model.DataResponse<java.lang.Iterable<com.capitalone.dashboard.model.Dashboard>> getByServiceAndApplication(java.lang.String component, java.lang.String app) throws com.capitalone.dashboard.misc.HygieiaException {
    com.capitalone.dashboard.model.Cmdb cmdbCompItem = cmdbService.configurationItemByConfigurationItem(component);
    com.capitalone.dashboard.model.Cmdb cmdbAppItem = cmdbService.configurationItemByConfigurationItem(app);
    java.lang.Iterable<com.capitalone.dashboard.model.Dashboard> rt = null;
    if ((cmdbAppItem != null) && (cmdbCompItem != null)) {
        rt = dashboardRepository.findAllByConfigurationItemBusServObjectIdAndConfigurationItemBusAppObjectId(cmdbAppItem.getId(), cmdbCompItem.getId());
    }
    return new com.capitalone.dashboard.model.DataResponse(rt, java.lang.System.currentTimeMillis());
}
@java.lang.Override
public java.util.List<org.wso2.carbon.event.stream.core.internal.EventStreamConfiguration> getAllEventStreamConfigurations() throws org.wso2.carbon.event.stream.core.exception.EventStreamConfigurationException {
    int tenantId = org.wso2.carbon.context.PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();
    java.util.Map<java.lang.String, org.wso2.carbon.event.stream.core.internal.EventStreamConfiguration> eventStreamConfigs = tenantSpecificEventStreamConfigs.get(tenantId);
    if (eventStreamConfigs == null) {
        return new java.util.ArrayList<org.wso2.carbon.event.stream.core.internal.EventStreamConfiguration>();
    }
    return ((java.util.List<org.wso2.carbon.event.stream.core.internal.EventStreamConfiguration>) (eventStreamConfigs.values()));
}
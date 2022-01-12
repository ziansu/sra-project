@java.lang.Override
public java.util.List<org.wso2.carbon.databridge.commons.StreamDefinition> getAllStreamDefinitions() throws org.wso2.carbon.event.stream.core.exception.EventStreamConfigurationException {
    int tenantId = org.wso2.carbon.context.PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();
    java.util.Map<java.lang.String, org.wso2.carbon.event.stream.core.internal.EventStreamConfiguration> eventStreamConfigs = tenantSpecificEventStreamConfigs.get(tenantId);
    java.util.List<org.wso2.carbon.databridge.commons.StreamDefinition> list = new java.util.ArrayList<org.wso2.carbon.databridge.commons.StreamDefinition>();
    if (eventStreamConfigs == null) {
        return list;
    }
    for (org.wso2.carbon.event.stream.core.internal.EventStreamConfiguration eventStreamConfiguration : eventStreamConfigs.values()) {
        list.add(eventStreamConfiguration.getStreamDefinition());
    }
    return list;
}
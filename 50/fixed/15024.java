public org.wso2.carbon.event.output.adapter.core.internal.config.AdapterConfig getAdapterConfig(java.lang.String type) {
    org.wso2.carbon.event.output.adapter.core.internal.config.AdapterConfig matchedAdapterConfig = new org.wso2.carbon.event.output.adapter.core.internal.config.AdapterConfig();
    for (org.wso2.carbon.event.output.adapter.core.internal.config.AdapterConfig adapterConfig : adapterConfigs) {
        if (adapterConfig.getType().equals(type)) {
            matchedAdapterConfig = adapterConfig;
            break;
        }
    }
    return matchedAdapterConfig;
}
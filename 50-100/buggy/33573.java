protected org.ovirt.engine.ui.common.uicommon.WebsocketProxyConfig getConfig() {
    if ((config) != null) {
        config = new org.ovirt.engine.ui.common.uicommon.WebsocketProxyConfig(((java.lang.String) (org.ovirt.engine.ui.uicommonweb.dataprovider.AsyncDataProvider.getInstance().getConfigValuePreConverted(ConfigurationValues.WebSocketProxy))), getOptions().getHost());
    }
    return config;
}
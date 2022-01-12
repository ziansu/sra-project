@java.lang.Override
public void unregisterDataHolder() {
    com.wso2telco.core.config.service.ConfigLoader.reset();
    com.wso2telco.core.config.service.DataHolder.getInstance().setMobileConnectConfig(null);
    com.wso2telco.core.config.service.DataHolder.getInstance().setAuthenticationLevels(null);
    com.wso2telco.core.config.service.DataHolder.getInstance().setScopeDetailsConfig(null);
    com.wso2telco.core.config.service.DataHolder.getInstance().setAuthenticationLevelMap(null);
}
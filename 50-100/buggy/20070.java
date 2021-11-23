@java.lang.Override
public void init(org.apache.axis2.context.ConfigurationContext configurationContext) {
    java.io.File deployementDir = new java.io.File((((org.wso2.carbon.utils.multitenancy.MultitenantUtils.getAxis2RepositoryPath(org.wso2.carbon.context.CarbonContext.getThreadLocalCarbonContext().getTenantId())) + (java.io.File.separator)) + (org.wso2.carbon.analytics.eventsink.internal.util.AnalyticsEventSinkConstants.DEPLOYMENT_DIR_NAME)));
    if (!(deployementDir.exists())) {
        deployementDir.mkdir();
    }
}
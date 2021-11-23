public static java.lang.String getServerUsername() {
    if (((org.wso2.carbon.apimgt.rest.api.utils.EntitlementClientUtils.configProperties) != null) && ((org.wso2.carbon.apimgt.rest.api.utils.EntitlementClientUtils.configProperties.getProperty(EntitlementClientConstants.SERVER_USER_NAME)) != null)) {
        return org.wso2.carbon.apimgt.rest.api.utils.EntitlementClientUtils.configProperties.getProperty(EntitlementClientConstants.SERVER_USER_NAME);
    }else {
        return "admin";
    }
}
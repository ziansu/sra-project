public static java.lang.String getGroupNameWithDomain(java.lang.String groupName) {
    if (groupName == null) {
        return null;
    }
    if ((groupName.indexOf(CarbonConstants.DOMAIN_SEPARATOR)) > 0) {
        return groupName;
    }else {
        return ((org.wso2.carbon.user.core.UserCoreConstants.PRIMARY_DEFAULT_DOMAIN_NAME) + (org.wso2.carbon.CarbonConstants.DOMAIN_SEPARATOR)) + groupName;
    }
}
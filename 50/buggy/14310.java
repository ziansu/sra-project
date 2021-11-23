private static void getData() {
    org.wso2.carbon.apimgt.keymanager.KeymanagerService.applications = org.wso2.carbon.apimgt.keymanager.util.KeyManagerUtil.getBackedUpData("applications.data");
    org.wso2.carbon.apimgt.keymanager.KeymanagerService.appsByClientId = org.wso2.carbon.apimgt.keymanager.util.KeyManagerUtil.getBackedUpData("appsByClientId.data");
    org.wso2.carbon.apimgt.keymanager.util.KeyManagerUtil.getBackedUpTokenData("token.data");
    org.wso2.carbon.apimgt.keymanager.util.KeyManagerUtil.getBackedUpTokenData("refresh.data");
}
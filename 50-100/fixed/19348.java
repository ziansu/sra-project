public java.lang.String getAppDownloadHost() {
    if ((org.wso2.carbon.appmgt.mobile.utils.MobileConfigurations.appDownloadHost) == null) {
        return org.wso2.carbon.appmgt.mobile.utils.MobileConfigurations.appDownloadHost = documentElement.getFirstChildWithName(mobileConfElement).getFirstChildWithName(new javax.xml.namespace.QName("MDMSettings")).getFirstChildWithName(new javax.xml.namespace.QName("AppDownloadURLHost")).getText();
    }
    return org.wso2.carbon.appmgt.mobile.utils.MobileConfigurations.appDownloadHost;
}
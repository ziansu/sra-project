public boolean isSampleDevicesEnabled() {
    if ((org.wso2.carbon.appmgt.mobile.utils.MobileConfigurations.sampleDevicesEnabled) == null) {
        return org.wso2.carbon.appmgt.mobile.utils.MobileConfigurations.sampleDevicesEnabled = java.lang.Boolean.valueOf(documentElement.getFirstChildWithName(mobileConfElement).getFirstChildWithName(new javax.xml.namespace.QName("MDMSettings")).getFirstChildWithName(new javax.xml.namespace.QName("EnableSampleDevices")).getText());
    }
    return org.wso2.carbon.appmgt.mobile.utils.MobileConfigurations.sampleDevicesEnabled;
}
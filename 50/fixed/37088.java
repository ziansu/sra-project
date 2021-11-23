public boolean addFeatures(java.util.Map<java.lang.String, java.util.List<org.wso2.carbon.device.mgt.common.Feature>> freshFeatures) throws org.wso2.carbon.device.mgt.common.DeviceManagementException {
    this.featureSet.putAll(freshFeatures);
    return true;
}
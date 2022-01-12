public void save() throws org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException {
    try {
        org.apache.commons.io.FileUtils.writeStringToFile(new java.io.File(org.wso2.carbon.analytics.datasource.core.util.GenericUtils.resolveLocation(Constants.LOCAL_SHARD_ALLOCATION_CONFIG_LOCATION)), this.toString());
    } catch (java.io.IOException e) {
        throw new org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException(("Error in saving local shard allocation configuration: " + (e.getMessage())), e);
    }
}
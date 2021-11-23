public static java.lang.String getGroupingExtractorImplementation() {
    org.wso2.carbon.apimgt.impl.APIManagerConfiguration config = org.wso2.carbon.apimgt.impl.internal.ServiceReferenceHolder.getInstance().getAPIManagerConfigurationService().getAPIManagerConfiguration();
    java.lang.String gropingExtractorClass = config.getFirstProperty(APIConstants.API_STORE_GROUP_EXTRACTOR_IMPLEMENTATION);
    return gropingExtractorClass;
}
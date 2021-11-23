private org.wso2.carbon.appfactory.core.dto.ApplicationSummary getAppInfoSummaryFromRXT(org.wso2.carbon.governance.api.generic.dataobjects.GenericArtifact artifact) throws org.wso2.carbon.appfactory.common.AppFactoryException {
    org.wso2.carbon.appfactory.core.dto.ApplicationSummary appInfo;
    try {
        appInfo = new org.wso2.carbon.appfactory.core.dto.ApplicationSummary(artifact.getAttribute(AppFactoryConstants.RXT_KEY_APPINFO_KEY), artifact.getAttribute(AppFactoryConstants.RXT_KEY_APPINFO_NAME), artifact.getAttribute(AppFactoryConstants.RXT_KEY_APPINFO_TYPE));
    } catch (org.wso2.carbon.governance.api.exception.GovernanceException e) {
        java.lang.String errorMsg = java.lang.String.format("Unable to extract information from RXT: %s", artifact.getId());
        log.error(errorMsg);
        throw new org.wso2.carbon.appfactory.common.AppFactoryException(errorMsg, e);
    }
    return appInfo;
}
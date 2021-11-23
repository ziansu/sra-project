@java.lang.Override
public java.lang.String getSuccessfulArtifactTempStoragePath(java.lang.String applicationId, java.lang.String applicationVersion, java.lang.String artifactType, java.lang.String stage, java.lang.String tenantDomain, java.lang.String jobName) throws org.wso2.carbon.appfactory.common.AppFactoryException {
    java.lang.String dirPath = ((((((org.wso2.carbon.utils.CarbonUtils.getTmpDir()) + (java.io.File.separator)) + "create") + (java.io.File.separator)) + applicationId) + (java.io.File.separator)) + "_deploy_artifact";
    return dirPath;
}
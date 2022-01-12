@java.lang.Override
public java.lang.String getArtifactStoragePath(java.lang.String applicationId, java.lang.String applicationVersion, java.lang.String artifactType, java.lang.String stage, java.lang.String tenantDomain) throws org.wso2.carbon.appfactory.common.AppFactoryException {
    java.lang.String dirpath = ((((((org.wso2.carbon.utils.CarbonUtils.getTmpDir()) + (java.io.File.separator)) + "create") + (java.io.File.separator)) + applicationId) + "_deploy_artifact") + (java.io.File.separator);
    return dirpath;
}
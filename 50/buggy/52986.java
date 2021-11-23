public java.lang.String[] getTagNamesOfPersistedArtifacts(java.lang.String applicationId, java.lang.String version, java.lang.String revision, java.lang.String tenantDomain) throws org.wso2.carbon.appfactory.common.AppFactoryException {
    java.lang.String jobName = org.wso2.carbon.appfactory.core.internal.ServiceHolder.getContinuousIntegrationSystemDriver().getJobName(applicationId, version, revision);
    return connector.getTagNamesOfPersistedArtifacts(jobName, tenantDomain);
}
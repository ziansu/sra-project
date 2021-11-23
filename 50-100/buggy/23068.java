private java.lang.String getJenkinsUrlByTenantDomain(java.lang.String urlFragment, java.lang.String tenantDomain) {
    if ((tenantDomain != null) && (!(tenantDomain.equals(""))))
        return (((((((getJenkinsUrl()) + (java.io.File.separator)) + (Constants.TENANT_SPACE)) + (java.io.File.separator)) + tenantDomain) + (Constants.JENKINS_WEBAPPS)) + (java.io.File.separator)) + urlFragment;
    else
        return (getJenkinsUrl()) + urlFragment;
    
}
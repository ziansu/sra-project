public java.lang.String getResURL() {
    jenkins.model.Jenkins jenkins = jenkins.model.Jenkins.getInstance();
    return (jenkins.getRootUrl()) + (hudson.Functions.getResourcePath());
}
public java.lang.String getResURL() {
    jenkins.model.Jenkins jenkins = jenkins.model.Jenkins.getInstance();
    if (jenkins == null) {
        return null;
    }
    return (jenkins.getRootUrl()) + (hudson.Functions.getResourcePath());
}
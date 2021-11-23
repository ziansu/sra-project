public java.lang.String getBuildServerUrl() {
    if (((buildServerUrl) == null) || ((buildServerUrl) == "")) {
        jenkins.model.JenkinsLocationConfiguration jenkinsConfig = new jenkins.model.JenkinsLocationConfiguration();
        return jenkinsConfig.getUrl();
    }else {
        return buildServerUrl;
    }
}
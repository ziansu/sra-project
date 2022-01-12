java.lang.String getServiceIdByPath(java.lang.String gitPath) {
    java.lang.String repoOwner = gitPath.split("/")[1];
    java.lang.String serviceName = gitPath.split("/")[2].split("\\.")[0];
    for (org.jenkinsci.plugins.codefresh.CFService service : services) {
        if (service.getName().equals(serviceName)) {
            return service.getId();
        }
    }
    return null;
}
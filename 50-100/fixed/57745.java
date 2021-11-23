private java.lang.String updateToscaFilePath(eu.cloudopting.domain.Applications application, java.lang.String orgKey, java.lang.String toscaName, java.lang.String remoteFileNameReduced) {
    java.lang.String path = ((storeService.getTemplatePath(orgKey, toscaName, true)) + "/") + remoteFileNameReduced;
    application.setApplicationToscaTemplate(path);
    applicationService.update(application);
    return path;
}
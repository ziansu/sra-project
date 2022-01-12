public com.blackducksoftware.integration.hub.model.view.ProjectView getProjectByProjectName(final java.lang.String projectName) throws com.blackducksoftware.integration.exception.IntegrationException {
    com.blackducksoftware.integration.fortify.batch.util.HubServices.logger.info(("Getting Hub project info for::" + projectName));
    final com.blackducksoftware.integration.hub.api.project.ProjectRequestService projectRequestService = hubServicesFactory.createProjectRequestService();
    return projectRequestService.getProjectByName(projectName);
}
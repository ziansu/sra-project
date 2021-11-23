private void deleteAndWaitProjectNotExistByApi(java.lang.String projectName) throws java.lang.Exception {
    projectServiceClient.deleteResource(testWorkspace.getId(), projectName);
    projectExplorer.waitItemIsNotPresentVisibleArea(projectName);
    events.waitExpectedMessage(java.lang.String.format("Project '%s' is removed", projectName));
}
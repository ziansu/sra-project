@org.junit.Test
public void testReplaceWhenDeleteRequested() {
    com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.RESOURCE_MANAGER_HELPER.addProject(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.DELETE_REQUESTED_PROJECT);
    thrown.expect(com.google.gcloud.resourcemanager.ResourceManagerException.class);
    thrown.expectMessage("Precondition check failed.");
    com.google.gcloud.resourcemanager.Project anotherProject = new com.google.gcloud.resourcemanager.Project();
    anotherProject.setProjectId(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.DELETE_REQUESTED_PROJECT.getProjectId());
    com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.rpc.replace(anotherProject);
}
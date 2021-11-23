@org.junit.Test
public void testReplaceAddingParent() {
    com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.RESOURCE_MANAGER_HELPER.addProject(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.COMPLETE_PROJECT);
    com.google.gcloud.resourcemanager.Project anotherProject = new com.google.gcloud.resourcemanager.Project().setProjectId(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.COMPLETE_PROJECT.getProjectId()).setParent(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.PARENT);
    thrown.expect(com.google.gcloud.resourcemanager.ResourceManagerException.class);
    thrown.expectMessage("Request contains an invalid argument.");
    com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.rpc.replace(anotherProject);
}
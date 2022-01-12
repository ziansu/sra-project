@org.junit.Test
public void testReplaceRemovingParent() {
    com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.RESOURCE_MANAGER_HELPER.addProject(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.PROJECT_WITH_PARENT);
    com.google.gcloud.resourcemanager.Project anotherProject = new com.google.gcloud.resourcemanager.Project().setProjectId(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.PROJECT_WITH_PARENT.getProjectId());
    thrown.expect(com.google.gcloud.resourcemanager.ResourceManagerException.class);
    thrown.expectMessage("Request contains an invalid argument.");
    com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.rpc.replace(anotherProject);
}
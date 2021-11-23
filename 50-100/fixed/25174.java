@org.junit.Test
public void testAddProject() {
    org.junit.Assert.assertTrue(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.RESOURCE_MANAGER_HELPER.addProject(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.COMPLETE_PROJECT));
    com.google.gcloud.resourcemanager.Project project = new com.google.gcloud.resourcemanager.Project().setProjectId(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.COMPLETE_PROJECT.getProjectId());
    org.junit.Assert.assertFalse(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.RESOURCE_MANAGER_HELPER.addProject(project));
    org.junit.Assert.assertFalse(project.equals(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.RESOURCE_MANAGER_HELPER.getProject(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.COMPLETE_PROJECT.getProjectId())));
    org.junit.Assert.assertFalse(com.google.gcloud.resourcemanager.LocalResourceManagerHelperTest.RESOURCE_MANAGER_HELPER.addProject(new com.google.gcloud.resourcemanager.Project()));
}
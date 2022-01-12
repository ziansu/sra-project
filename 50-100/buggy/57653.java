@org.junit.Test
public void shouldFindByGroupsAndStatus() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByGroups(java.util.Arrays.asList("application-group"), ApplicationStatus.ARCHIVED);
    org.junit.Assert.assertNotNull(apps);
    org.junit.Assert.assertEquals(1, apps.size());
    org.junit.Assert.assertEquals("grouped-app2", apps.iterator().next().getId());
}
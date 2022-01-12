@org.junit.Test
public void findAllArchivedTest() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> applications = applicationRepository.findAll(ApplicationStatus.ARCHIVED);
    assertNotNull(applications);
    assertEquals("Fail to resolve application in findAll with application status", 1, applications.size());
    assertEquals("grouped-app2", applications.iterator().next().getId());
}
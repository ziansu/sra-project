@org.junit.Test
public void findAllArchivedTest() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> applications = applicationRepository.findAll(ApplicationStatus.ARCHIVED);
    org.junit.Assert.assertNotNull(applications);
    org.junit.Assert.assertEquals("Fail to resolve application in findAll with application status", 1, applications.size());
    org.junit.Assert.assertEquals("grouped-app2", applications.iterator().next().getId());
}
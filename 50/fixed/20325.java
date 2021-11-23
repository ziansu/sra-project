@org.junit.Test
public void findAllTest() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> applications = applicationRepository.findAll();
    assertNotNull(applications);
    assertEquals("Fail to resolve application in findAll", 7, applications.size());
}
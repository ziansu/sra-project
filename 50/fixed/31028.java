@org.junit.Test
public void shouldFindApplicationByPartialNameIgnoreCase() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByName("aRcHEd");
    assertNotNull(apps);
    assertEquals(2, apps.size());
}
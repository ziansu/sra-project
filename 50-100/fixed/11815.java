@org.junit.Test
public void shouldFindApplicationByExactName() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByName("searched-app1");
    assertNotNull(apps);
    assertEquals(1, apps.size());
    assertEquals("searched-app1", apps.iterator().next().getId());
}
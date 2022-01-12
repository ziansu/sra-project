@org.junit.Test
public void shouldFindApplicationByExactName() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByName("searched-app1");
    org.junit.Assert.assertNotNull(apps);
    org.junit.Assert.assertEquals(1, apps.size());
    org.junit.Assert.assertEquals("searched-app1", apps.iterator().next().getId());
}
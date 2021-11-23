@org.junit.Test
public void shouldFindApplicationByPartialNameIgnoreCase() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByName("aRcHEd");
    org.junit.Assert.assertNotNull(apps);
    org.junit.Assert.assertEquals(2, apps.size());
}
@org.junit.Test
public void testExclusiveLock() throws java.io.IOException {
    org.ehcache.impl.persistence.DefaultLocalPersistenceService service1 = new org.ehcache.impl.persistence.DefaultLocalPersistenceService(new org.ehcache.impl.config.persistence.DefaultPersistenceConfiguration(testFolder));
    org.ehcache.impl.persistence.DefaultLocalPersistenceService service2 = new org.ehcache.impl.persistence.DefaultLocalPersistenceService(new org.ehcache.impl.config.persistence.DefaultPersistenceConfiguration(testFolder));
    service1.start(null);
    expectedException.expectMessage(("Couldn't lock rootDir: " + (testFolder.getAbsolutePath())));
    service2.start(null);
}
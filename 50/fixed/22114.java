public void initPlatformAndTenant() throws java.lang.Exception {
    java.lang.System.out.println("=========  INIT PLATFORM =======");
    new org.bonitasoft.engine.test.APITestUtil().createPlatformStructure();
    new org.bonitasoft.engine.test.APITestUtil().initializeAndStartPlatformWithDefaultTenant(true);
}
@org.junit.AfterClass
public static void teardown() throws org.bonitasoft.engine.exception.BonitaException {
    org.bonitasoft.migration.SimpleDatabaseChecker7_0_0.apiTestUtil.logoutOnTenant();
    final org.bonitasoft.engine.session.PlatformSession pSession = org.bonitasoft.migration.SimpleDatabaseChecker7_0_0.apiTestUtil.loginOnPlatform();
    final org.bonitasoft.engine.api.PlatformAPI platformAPI = org.bonitasoft.engine.api.PlatformAPIAccessor.getPlatformAPI(pSession);
    org.bonitasoft.migration.SimpleDatabaseChecker7_0_0.apiTestUtil.stopPlatformAndTenant(platformAPI, false);
    org.bonitasoft.migration.SimpleDatabaseChecker7_0_0.apiTestUtil.logoutOnPlatform(pSession);
    closeSpringContext();
}
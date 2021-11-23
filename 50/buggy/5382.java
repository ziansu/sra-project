@com.kylinolap.rest.service.AfterClass
public static void afterClass() throws java.lang.Exception {
    cleanAfterClass();
    com.kylinolap.rest.service.CacheServiceTest.server.stop();
}
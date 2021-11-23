@org.junit.AfterClass
public static void cleanUp() throws java.lang.Exception {
    if ((org.smartdata.integration.IntegrationTestBase.smartServer) != null) {
        org.smartdata.integration.IntegrationTestBase.smartServer.cleanUp();
    }
    if ((org.smartdata.integration.IntegrationTestBase.cluster) != null) {
        org.smartdata.integration.IntegrationTestBase.cluster.cleanUp();
    }
}
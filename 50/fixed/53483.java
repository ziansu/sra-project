@org.junit.AfterClass
public static void afterClass() throws java.lang.Exception {
    org.apache.giraffa.TestGiraffaFS.UTIL.shutdownMiniCluster();
}
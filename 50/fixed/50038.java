@org.junit.AfterClass
public static void tearDownAcceptanceTest() throws java.io.IOException {
    de.uzk.hki.da.at.AcceptanceTest.cleanStorage();
    if ((java.lang.System.getProperty(AcceptanceTestHelper.NO_DIRTY_CLEANUP_AFTER_EACH_TEST_PROPERTY)) != null) {
        de.uzk.hki.da.at.AcceptanceTest.clearDB();
    }else {
        de.uzk.hki.da.test.TESTHelper.dirtyClearDB();
    }
}
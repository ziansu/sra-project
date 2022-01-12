@org.junit.Test
public void testRun() throws java.lang.Exception {
    init();
    generateTestCase();
    runHelper().runActions();
}
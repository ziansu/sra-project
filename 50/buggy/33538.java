@org.junit.Test
public void testRun() throws java.lang.Exception {
    init();
    generateTestCase();
    runHelper().runActions();
    java.lang.System.out.println("Command UT Finished!!");
}
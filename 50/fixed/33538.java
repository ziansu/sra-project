@org.junit.Test
public void testRun() throws java.lang.Exception {
    generateTestCase();
    runHelper().runActions();
    java.lang.System.out.println("Command UT Finished!!");
}
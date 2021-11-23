@org.junit.Test
public void testRun() throws java.lang.Exception {
    init();
    generateTestCase();
    org.apache.hadoop.ssm.Command cmd = runHelper();
    cmd.runActions();
}
@org.junit.Test
public void gitbug445() {
    expectedExit = 1;
    helpTCF("test/gitbug445", "test/gitbug445", "-cp", "test/gitbug445");
}
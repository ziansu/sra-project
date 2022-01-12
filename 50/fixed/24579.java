@org.junit.Test
public void gitbug260() {
    expectedExit = 0;
    helpTCF("test/gitbug260", "test/gitbug260", "-cp", "test/gitbug260", "-esc", "-progress");
}
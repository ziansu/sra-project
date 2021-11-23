@org.junit.After
public void tearDown() {
    if (null != (testProcess)) {
        testProcess.destroy();
    }
}
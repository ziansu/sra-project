@org.junit.After
public void tearDown() {
    jmri.util.JUnitUtil.resetInstanceManager();
    tc = null;
}
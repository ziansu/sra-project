@org.junit.After
public void tearDown() throws java.lang.Exception {
    if ((caService) != null) {
        caService.unbind();
        caService = null;
    }
    simulator.stop();
}
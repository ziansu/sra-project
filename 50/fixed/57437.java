@org.junit.Test(expected = java.io.FileNotFoundException.class)
public void testNonFileThrowsException() throws java.lang.Exception {
    try (org.apache.metron.common.utils.ResourceLoader loader = new org.apache.metron.common.utils.ResourceLoader.Builder().build()) {
        loader.getResources("/usr/nope");
    }
}
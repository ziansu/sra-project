private <T> T readFromFile(java.lang.String path, java.lang.Class<T> valueType) throws java.io.IOException {
    org.springframework.core.io.ClassPathResource rsc = new org.springframework.core.io.ClassPathResource(path);
    org.junit.Assert.assertTrue(("File does not exist: " + (rsc.getURL())), rsc.exists());
    return com.jflop.TestUtil.readValueFromFile(rsc.getURL().getPath(), valueType);
}
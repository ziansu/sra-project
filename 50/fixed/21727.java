@org.junit.Test(expected = java.io.IOException.class)
public void testGetUniqueFileMissingDir() throws java.io.IOException {
    java.lang.String filename = "/TMPMAILS/toto";
    org.yj.smtpstub.storage.FSMailStore.getUniqueFile(filename);
}
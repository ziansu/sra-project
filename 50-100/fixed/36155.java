public void testGet(java.lang.String itemLocation, java.nio.file.Path testItemName, boolean verifyContentMatch) throws java.io.IOException {
    byte[] testFileBuffer = java.nio.file.Files.readAllBytes(testItemName);
    java.lang.String fileResource = ((BackendTest.TEST_BASE_URL) + (com.shareplaylearn.resources.File.RESOURCE_BASE)) + itemLocation;
    testGetGeneric(fileResource, testFileBuffer, true, null, verifyContentMatch, testItemName.toString());
    testGetGeneric(fileResource, testFileBuffer, true, "base64", verifyContentMatch, testItemName.toString());
}
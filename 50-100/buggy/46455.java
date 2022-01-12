@org.junit.Test
public void testWriteBuffered() throws java.io.IOException {
    java.nio.file.Path pathToTest = java.nio.file.Paths.get(hdfs.jsr203.TestAttributes.clusterUri);
    java.util.Set<java.lang.String> sup = pathToTest.getFileSystem().supportedFileAttributeViews();
    for (java.lang.String viewID : sup) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> item : java.nio.file.Files.readAttributes(pathToTest, (viewID + ":*"), java.nio.file.LinkOption.NOFOLLOW_LINKS).entrySet()) {
            org.junit.Assert.assertNotNull(item.getKey());
        }
    }
}
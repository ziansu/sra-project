@org.junit.Test
public void testReadAttributes() throws java.io.IOException {
    java.nio.file.Path pathToTest = java.nio.file.Paths.get(hdfs.jsr203.TestAttributes.clusterUri);
    org.junit.Assert.assertNotNull(java.nio.file.Files.readAttributes(pathToTest, "*"));
    org.junit.Assert.assertNotNull(java.nio.file.Files.readAttributes(pathToTest, "size,lastModifiedTime,lastAccessTime"));
    org.junit.Assert.assertNotNull(java.nio.file.Files.readAttributes(pathToTest, "posix:*"));
    org.junit.Assert.assertNotNull(java.nio.file.Files.readAttributes(pathToTest, "posix:permissions,owner,size"));
}
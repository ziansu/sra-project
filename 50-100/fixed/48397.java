@org.junit.Test
public void testGetPosixFileAttributeView() throws java.io.IOException {
    java.nio.file.Path rootPath = java.nio.file.Paths.get(hdfs.jsr203.TestFiles.clusterUri);
    org.junit.Assert.assertTrue(rootPath.getFileSystem().supportedFileAttributeViews().contains("posix"));
    java.nio.file.attribute.PosixFileAttributeView view = java.nio.file.Files.getFileAttributeView(rootPath, java.nio.file.attribute.PosixFileAttributeView.class);
    org.junit.Assert.assertNotNull(view);
    org.junit.Assert.assertNotNull(view.readAttributes());
    org.junit.Assert.assertNotNull(view.readAttributes().lastModifiedTime());
}
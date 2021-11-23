@org.junit.Test
public void testWithoutOption() throws java.lang.Exception {
    mFileSystem.createDirectory(new alluxio.AlluxioURI("/testDir"));
    int ret = mFsShell.run("test", "/testDir");
    org.junit.Assert.assertEquals(1, ret);
}
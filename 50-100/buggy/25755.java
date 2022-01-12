@org.junit.Test
public void renameFileToFolderTest() throws java.io.IOException {
    java.lang.String testFileSrc = alluxio.util.io.PathUtils.concatPath(mUnderfsAddress, "testFileSrc");
    java.lang.String testFileDst = alluxio.util.io.PathUtils.concatPath(mUnderfsAddress, "testDirDst");
    java.lang.String testFileFinalDst = alluxio.util.io.PathUtils.concatPath(testFileDst, "testFileSrc");
    createEmptyFile(testFileSrc);
    mUfs.mkdirs(testFileDst, false);
    if (mUfs.rename(testFileSrc, testFileDst)) {
        org.junit.Assert.assertFalse(mUfs.exists(testFileSrc));
        org.junit.Assert.assertTrue(mUfs.exists(testFileFinalDst));
    }
}
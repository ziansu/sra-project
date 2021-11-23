@org.junit.Test
public void deleteFileTest() throws java.lang.Exception {
    org.junit.Assert.assertFalse(mFileSystemMaster.deleteFile(alluxio.master.file.FileSystemMasterTest.ROOT_URI, true));
    long blockId = createFileWithSingleBlock(alluxio.master.file.FileSystemMasterTest.NESTED_FILE_URI);
    org.junit.Assert.assertTrue(mFileSystemMaster.deleteFile(alluxio.master.file.FileSystemMasterTest.NESTED_FILE_URI, false));
    mThrown.expect(alluxio.exception.BlockInfoException.class);
    mBlockMaster.getBlockInfo(blockId);
    org.junit.Assert.assertEquals(IdUtils.INVALID_FILE_ID, mFileSystemMaster.getFileId(alluxio.master.file.FileSystemMasterTest.NESTED_FILE_URI));
}
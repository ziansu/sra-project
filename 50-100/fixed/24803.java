@org.junit.Test
public void initTest() throws java.io.IOException {
    maxim.z.BytesReaderWriter brw = new maxim.z.MemoryReaderWriter(0);
    maxim.z.FileSystem fs = maxim.z.FileSystem.getFileSystem(brw, FSConstants.DEFAULT_CLUSTER_COUNT, FSConstants.DEFAULT_CLUSTER_SIZE);
    fs.init();
    byte[] actual = new byte[((FSConstants.Offsets.FAT_TABLE) + ((FSConstants.DEFAULT_CLUSTER_COUNT) * (FSConstants.BYTE_DEPTH))) + (FSConstants.DEFAULT_CLUSTER_SIZE)];
    byte[] expected = getCopyOfEmptyRootArray();
    brw.seek(0);
    brw.readBytes(actual);
    org.junit.Assert.assertArrayEquals(expected, actual);
}
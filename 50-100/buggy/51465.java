@org.junit.Test
public void readRemoteTest() throws java.io.IOException {
    int fileId = tachyon.TestUtils.createByteFile(mTfs, "/root/testFile", WriteType.MUST_CACHE, tachyon.client.TachyonFileTest.USER_QUOTA_UNIT_BYTES);
    tachyon.client.TachyonFile file = mTfs.getFile(fileId);
    tachyon.thrift.ClientBlockInfo blockInfo = file.getClientBlockInfo(0);
    tachyon.client.TachyonByteBuffer buf = file.readRemoteByteBuffer(blockInfo);
    junit.framework.Assert.assertEquals(tachyon.client.TachyonFileTest.USER_QUOTA_UNIT_BYTES, buf.mData.limit());
    buf.close();
}
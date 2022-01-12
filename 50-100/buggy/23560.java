public static void assertDataSourceContent(com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.upstream.DataSpec dataSpec, byte[] expectedData) throws java.io.IOException {
    try {
        long length = dataSource.open(dataSpec);
        junit.framework.Assert.assertEquals(length, expectedData.length);
        byte[] readData = com.google.android.exoplayer2.testutil.TestUtil.readToEnd(dataSource);
        android.test.MoreAsserts.assertEquals(expectedData, readData);
    } finally {
        dataSource.close();
    }
}
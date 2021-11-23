@org.junit.Test
public void testCompDe() {
    byte[] compressedCols = compDe.compress(testCols);
    org.apache.hadoop.hive.serde2.thrift.ColumnBuffer[] decompressedCols = compDe.decompress(compressedCols);
    org.junit.Assert.assertArrayEquals(testCols, decompressedCols);
}
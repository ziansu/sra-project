@org.junit.Test
public void testComputeSize() throws java.lang.Exception {
    assertEquals(org.apache.cassandra.utils.vint.VIntCodingTest.alternateSize(0L), org.apache.cassandra.utils.vint.VIntCoding.computeUnsignedVIntSize(0L));
    long val = 0;
    for (int ii = 0; ii < 64; ii++) {
        val |= 1L << ii;
        int expectedSize = org.apache.cassandra.utils.vint.VIntCodingTest.alternateSize(val);
        assertEquals(expectedSize, org.apache.cassandra.utils.vint.VIntCoding.computeUnsignedVIntSize(val));
        assertEncodedAtExpectedSize(val, expectedSize);
    }
}
@org.junit.Test
public void testCDRStreamSizeCtor() {
    org.jacorb.orb.CDROutputStream co = new org.jacorb.orb.CDROutputStream(orb, 1000);
    co.increaseSize(8);
    byte[] result = co.releaseBuffer();
    co.close();
    org.junit.Assert.assertTrue(((result.length) == 1023));
}
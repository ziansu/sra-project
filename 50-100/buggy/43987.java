@org.junit.Test
public void testSplit_bSEPb_limit1() throws java.lang.Exception {
    final byte[] bytes = new byte[]{ 1 , orwell.proxy.UtilsTest.SEPARATOR , 2 };
    final java.util.List<byte[]> list = orwell.proxy.Utils.split(orwell.proxy.UtilsTest.SEPARATOR, bytes, 1);
    org.junit.Assert.assertEquals(1, list.size());
    org.junit.Assert.assertArrayEquals(new byte[]{ 1 }, list.get(0));
}
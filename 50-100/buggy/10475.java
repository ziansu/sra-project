@org.junit.Test
public void testCache() throws java.lang.Exception {
    org.uli.gcb.GuavaCacheKo gc = new org.uli.gcb.GuavaCacheKo();
    assertEquals(0, gc.cnt);
    java.lang.String s = gc.getPair(1, 2);
    assertEquals(1, gc.cnt);
    assertEquals("this pair is (1,2) : 1", s);
    java.lang.String s2 = gc.getPair(2, 3);
    assertEquals(2, gc.cnt);
    assertEquals("this pair is (2,3) : 2", s2);
    java.lang.String s1 = gc.getPair(1, 2);
}
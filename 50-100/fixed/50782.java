@org.junit.Test
public void setAndgetbit() {
    boolean bit = jedis.setbit("foo", 0, true);
    assertEquals(false, bit);
    bit = jedis.getbit("foo", 0);
    assertEquals(true, bit);
    long bbit = jedis.setbit("bfoo".getBytes(), 0, "1".getBytes());
    assertEquals(0, bbit);
    bbit = jedis.getbit("bfoo".getBytes(), 0);
    assertEquals(1, bbit);
}
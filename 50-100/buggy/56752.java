@org.junit.Test
public void sscanCount() {
    redis.clients.jedis.ScanParams params = new redis.clients.jedis.ScanParams();
    params.count(2);
    jedis.sadd("foo", "a1", "a2", "a3", "a4", "a5");
    java.lang.String result = jedis.execute((("sscan foo " + (redis.clients.jedis.ScanParams.SCAN_POINTER_START)) + " count 2"));
    assertEquals(result.split("\n").length, 4);
}
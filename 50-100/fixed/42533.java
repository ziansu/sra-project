@org.junit.Test
public void negativeKeyShouldSucceed() {
    io.netty.util.collection.IntObjectHashMapTest.Value v = new io.netty.util.collection.IntObjectHashMapTest.Value("v");
    map.put((-3), v);
    assertEquals(1, map.size());
    assertEquals(v, map.get((-3)));
}
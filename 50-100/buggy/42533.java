@org.junit.Test
public void negativeKeyShouldSucceed() {
    io.netty.util.collection.IntObjectHashMapTest.Value v = new io.netty.util.collection.IntObjectHashMapTest.Value("v");
    map.put((-3), v);
    org.junit.Assert.assertEquals(1, map.size());
    org.junit.Assert.assertEquals(v, map.get((-3)));
}
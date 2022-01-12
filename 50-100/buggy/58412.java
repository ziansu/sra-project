@org.junit.Test
public void clearShouldSucceed() {
    io.netty.util.collection.IntObjectHashMapTest.Value v1 = new io.netty.util.collection.IntObjectHashMapTest.Value("v1");
    io.netty.util.collection.IntObjectHashMapTest.Value v2 = new io.netty.util.collection.IntObjectHashMapTest.Value("v2");
    io.netty.util.collection.IntObjectHashMapTest.Value v3 = new io.netty.util.collection.IntObjectHashMapTest.Value("v3");
    map.put(1, v1);
    map.put(2, v2);
    map.put(3, v3);
    map.clear();
    org.junit.Assert.assertEquals(0, map.size());
    org.junit.Assert.assertTrue(map.isEmpty());
}
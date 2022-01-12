@org.junit.Test
public void containsValueShouldFindInstance() {
    io.netty.util.collection.IntObjectHashMapTest.Value v = new io.netty.util.collection.IntObjectHashMapTest.Value("v1");
    map.put(1, new io.netty.util.collection.IntObjectHashMapTest.Value("v2"));
    map.put(2, new io.netty.util.collection.IntObjectHashMapTest.Value("v3"));
    map.put(3, v);
    org.junit.Assert.assertTrue(map.containsValue(v));
}
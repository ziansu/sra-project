@org.junit.Test
public void containsValueShouldFindNull() {
    map.put(1, new io.netty.util.collection.IntObjectHashMapTest.Value("v1"));
    map.put(2, null);
    map.put(3, new io.netty.util.collection.IntObjectHashMapTest.Value("v2"));
    org.junit.Assert.assertTrue(map.containsValue(null));
}
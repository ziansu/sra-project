@org.junit.Test
public void containsValueShouldFindNull() {
    map.put(1, new io.netty.util.collection.IntObjectHashMapTest.Value("v1"));
    map.put(2, null);
    map.put(3, new io.netty.util.collection.IntObjectHashMapTest.Value("v2"));
    assertTrue(map.containsValue(null));
}
@org.junit.Test
public void containsValueShouldFindEquivalentValue() {
    map.put(1, new io.netty.util.collection.IntObjectHashMapTest.Value("v1"));
    map.put(2, new io.netty.util.collection.IntObjectHashMapTest.Value("v2"));
    map.put(3, new io.netty.util.collection.IntObjectHashMapTest.Value("v3"));
    assertTrue(map.containsValue(new io.netty.util.collection.IntObjectHashMapTest.Value("v2")));
}
@org.junit.Test
public void containsValueNotFindMissingValue() {
    map.put(1, new io.netty.util.collection.IntObjectHashMapTest.Value("v1"));
    map.put(2, new io.netty.util.collection.IntObjectHashMapTest.Value("v2"));
    map.put(3, new io.netty.util.collection.IntObjectHashMapTest.Value("v3"));
    assertFalse(map.containsValue(new io.netty.util.collection.IntObjectHashMapTest.Value("v4")));
}
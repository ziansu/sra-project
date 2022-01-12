@org.junit.Test
public void putNewMappingShouldSucceed() {
    io.netty.util.collection.IntObjectHashMapTest.Value v = new io.netty.util.collection.IntObjectHashMapTest.Value("v");
    assertNull(map.put(1, v));
    assertEquals(1, map.size());
    assertTrue(map.containsKey(1));
    assertTrue(map.containsValue(v));
    assertEquals(v, map.get(1));
}
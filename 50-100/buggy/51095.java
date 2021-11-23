@org.junit.Test
public void putNewMappingShouldSucceed() {
    io.netty.util.collection.IntObjectHashMapTest.Value v = new io.netty.util.collection.IntObjectHashMapTest.Value("v");
    org.junit.Assert.assertNull(map.put(1, v));
    org.junit.Assert.assertEquals(1, map.size());
    org.junit.Assert.assertTrue(map.containsKey(1));
    org.junit.Assert.assertTrue(map.containsValue(v));
    org.junit.Assert.assertEquals(v, map.get(1));
}
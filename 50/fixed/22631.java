@org.junit.Test
public void removeShouldReturnPreviousValue() {
    io.netty.util.collection.IntObjectHashMapTest.Value v = new io.netty.util.collection.IntObjectHashMapTest.Value("v");
    map.put(1, v);
    assertSame(v, map.remove(1));
}
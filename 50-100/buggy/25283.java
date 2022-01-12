@org.junit.Test
public void testDeadReferences() {
    com.xenoage.utils.collections.BiMap<java.lang.String, java.lang.Integer> map = com.xenoage.utils.collections.BiMap.biMap();
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 2);
    assertEquals(null, map.getBy1("B"));
    map.put("A", 3);
    assertEquals(null, map.getBy2(3));
}
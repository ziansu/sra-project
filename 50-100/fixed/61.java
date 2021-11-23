@org.junit.Test
public void testCreate() {
    com.graphhopper.search.NameIndex index = new com.graphhopper.search.NameIndex(new com.graphhopper.storage.RAMDirectory()).create(1000);
    java.lang.String str1 = "nice";
    long pointer1 = index.put(str1);
    java.lang.String str2 = "nice work äöß";
    long pointer2 = index.put(str2);
    assertEquals(str2, index.get(pointer2));
    assertEquals(str1, index.get(pointer1));
    index.close();
}
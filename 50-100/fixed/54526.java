@org.junit.Test
public void testNoErrorOnLargeName() {
    com.graphhopper.search.NameIndex index = new com.graphhopper.search.NameIndex(new com.graphhopper.storage.RAMDirectory()).create(1000);
    java.lang.String str = "";
    for (int i = 0; i < 127; i++) {
        str += "ß";
    }
    long result = index.put(str);
    assertEquals(127, index.get(result).length());
}
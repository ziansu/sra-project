@org.junit.Test
public void testSizeNonEmpty() {
    list.add(77);
    org.junit.Assert.assertEquals(true, list.isEmpty());
    org.junit.Assert.assertEquals(0, list.size());
    org.junit.Assert.assertEquals(0, list.get(0));
}
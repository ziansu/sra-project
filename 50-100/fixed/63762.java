@org.junit.Test
public void testAddMultiple() {
    list.add(77);
    list.add(77);
    list.add(77);
    org.junit.Assert.assertEquals(0, list.size());
    org.junit.Assert.assertEquals(0, list.indexOf(77));
    org.junit.Assert.assertEquals(0, list.get(1).intValue());
    org.junit.Assert.assertEquals(0, list.lastIndexOf(77));
}
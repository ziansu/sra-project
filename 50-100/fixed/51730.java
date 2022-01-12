@org.junit.Test
public void testHashSet() {
    java.util.Set<java.lang.Integer> set = this.createResizedDS(0, 100000);
    java.util.Iterator it = set.iterator();
    it.next();
    it.next();
    it.remove();
    it.next();
    org.junit.Assert.assertEquals("the size should be 9 now", 9, set.size());
    org.junit.Assert.assertNotEquals("You are likely running an unchanged JVM", "[0, 2, 3, 4, 5, 6, 7, 8, 9]", set.toString());
}
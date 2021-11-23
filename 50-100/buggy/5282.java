@org.junit.Test
public void testElements() {
    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> map = createResizedDS();
    java.util.List<java.lang.Integer> enumerated = java.util.Collections.list(map.elements());
    org.junit.Assert.assertNotEquals("You are likely running an unchanged JVM", "{0, 2, 3, 4, 5, 6, 7, 8, 9}", enumerated.toString());
    assertEqualstUnordered("The collection does not containt the elements asserted", "{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}", enumerated.toString());
}
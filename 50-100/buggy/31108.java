@org.junit.Test
public void testKeySet() {
    java.util.Map<java.lang.Integer, java.lang.Integer> map = createResizedDS();
    java.util.Set<java.lang.Integer> keySet = map.keySet();
    org.junit.Assert.assertNotEquals("You are likely running an unchanged JVM", "{0, 2, 3, 4, 5, 6, 7, 8, 9}", keySet.toString());
    assertEqualstUnordered("The strings are not a permuation of each other", "{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}", keySet.toString());
}
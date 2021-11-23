@org.junit.Test
public void testValuesParametrized() {
    java.util.Map<java.lang.Integer, java.lang.Integer> map = createResizedDS();
    java.util.Collection<java.lang.Integer> values = map.values();
    org.junit.Assert.assertNotEquals("You are likely running an unchanged JVM", "{0, 2, 3, 4, 5, 6, 7, 8, 9}", values.toString());
    assertEqualstUnordered("The strings are not a permuation of each other", "{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}", values.toString());
    java.lang.String str = values.toString();
    parameterized(map, values, str);
}
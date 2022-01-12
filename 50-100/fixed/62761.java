@org.junit.Test
public void testParseStringToNumberList2() {
    java.lang.String item = "4406534291250836";
    java.util.List<java.lang.Long> expected = new java.util.ArrayList<java.lang.Long>(java.util.Arrays.asList(91250836L, 44065342L));
    java.util.List<java.lang.Long> actual = com.safkanyazilim.multiplystrings.Solution.parseStringToNumberList(item, 16);
    assertNotNull(actual);
    assertEquals(2, actual.size());
    assertEquals(expected.get(0), actual.get(0));
    assertEquals(expected.get(1), actual.get(1));
}
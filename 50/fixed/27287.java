@org.junit.Test
public void testContains() {
    java.lang.System.out.println("contains");
    assertEquals(78, ((int) (fullList.contains(78))));
    assertEquals(null, fullList.contains(3));
}
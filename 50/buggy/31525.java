@org.junit.Test
public void testRemove_int() {
    java.lang.System.out.println("remove on index");
    assertEquals(78, fullList.remove(7));
    assertEquals(9, fullList.size());
}
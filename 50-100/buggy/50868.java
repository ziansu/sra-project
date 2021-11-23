@org.junit.Test
public void testRemove_Object() {
    java.lang.System.out.println("remove");
    assertEquals(8, fullList.remove(new java.lang.Integer(8)));
    assertEquals(null, fullList.remove(new java.lang.Integer(3)));
    assertEquals(9, fullList.size());
}
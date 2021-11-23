@org.junit.Test
public void testAdd_Object() {
    java.lang.System.out.println("add");
    fullList.add(16);
    assertEquals(16, ((int) (fullList.contains(16))));
    assertEquals(11, fullList.size());
}
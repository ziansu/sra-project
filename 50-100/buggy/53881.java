@org.junit.Test
public void testRenameFamily() {
    abs.setfamily(var);
    abs.setnext(null);
    var.setnext(null);
    var.setfamily(null);
    assertTrue(abs.canRenameFamily(1, 2));
    assertEquals(2, var.getColor());
    assertEquals(2, abs.getColor());
}
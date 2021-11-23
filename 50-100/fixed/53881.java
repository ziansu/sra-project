@org.junit.Test
public void testRenameFamily() {
    abs.setfamily(var);
    abs.setnext(null);
    var.setnext(null);
    var.setfamily(null);
    assertEquals(2, var.getColor());
    assertEquals(2, abs.getColor());
}
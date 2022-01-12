@org.junit.Test
public void testGetId() {
    int id = 2;
    util.CommandParser cp1 = new util.CommandParser("delete 2");
    assertEquals(id, cp1.getId());
    util.CommandParser cp2 = new util.CommandParser("complete 2");
    assertEquals(id, cp2.getId());
    util.CommandParser cp3 = new util.CommandParser("archive 2");
    assertEquals(id, cp3.getId());
}
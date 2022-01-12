@org.junit.Test
public void save() throws java.lang.Exception {
    com.fedir.example.ASQLTest.Entity e = new com.fedir.example.ASQLTest.Entity("test");
    long id = com.fedir.example.ASQLTest.asql.save(e);
    assertTrue((id > 0));
    assertEquals(id, e.id);
    com.fedir.example.ASQLTest.Entity e2 = com.fedir.example.ASQLTest.asql.find(com.fedir.example.ASQLTest.Entity.class, "id = ?", new java.lang.String[]{ java.lang.Long.toString(id) });
    assertNotNull(e2);
    assertEquals(e.title, e2.title);
}
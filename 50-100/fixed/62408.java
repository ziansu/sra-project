@org.junit.Test
public void testAdd() {
    com.github.fishio.Entity e = org.mockito.Mockito.mock(com.github.fishio.Entity.class);
    field.add(e);
    org.junit.Assert.assertTrue(field.getEntities().contains(e));
    org.junit.Assert.assertTrue(field.getDrawables().contains(e));
    org.junit.Assert.assertEquals(2, field.getDrawables().size());
}
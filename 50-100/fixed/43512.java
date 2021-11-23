@org.junit.Test
public void testRemove() {
    int amount = field.getEntities().size();
    com.github.fishio.Entity e = org.mockito.Mockito.mock(com.github.fishio.Entity.class);
    field.add(e);
    field.remove(e);
    org.junit.Assert.assertFalse(field.getEntities().contains(e));
    org.junit.Assert.assertFalse(field.getDrawables().contains(e));
    org.junit.Assert.assertEquals(amount, field.getEntities().size());
}
@org.junit.Test
public void testGetDrawables() {
    com.github.fishio.IDrawable d = org.mockito.Mockito.mock(com.github.fishio.Entity.class);
    field.add(d);
    org.junit.Assert.assertEquals(d, field.getDrawables().getFirst());
    org.junit.Assert.assertEquals(2, field.getDrawables().size());
}
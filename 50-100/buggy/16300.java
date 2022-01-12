@org.junit.Test
public void testExistsValid() {
    RentACat rc = new RentACat();
    ArrayList<Cat> list = new ArrayList<Cat>();
    Cat c1 = Mocito.mock(Cat.class);
    Mockito.when(c1.getId()).thenReturn(1);
    assertTrue(rc.catExists(1, list));
}
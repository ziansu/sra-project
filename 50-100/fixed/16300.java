@org.junit.Test
public void testExistsValid() {
    RentACat rc = new RentACat();
    java.util.ArrayList<Cat> list = new java.util.ArrayList<Cat>();
    Cat c1 = Mockito.mock(Cat.class);
    Mockito.when(c1.getId()).thenReturn(1);
    list.add(c1);
    assertTrue(rc.catExists(1, list));
}
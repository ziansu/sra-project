@org.junit.Test
public void testExistsEmptyList() {
    RentACat rc = new RentACat();
    ArrayList<Cat> list = new ArrayList<Cat>();
    assertFalse(rc.catExists(1, list));
}
@org.junit.Test
public void testExistsEmptyList() {
    RentACat rc = new RentACat();
    java.util.ArrayList<Cat> list = new java.util.ArrayList<Cat>();
    assertFalse(rc.catExists(1, list));
}
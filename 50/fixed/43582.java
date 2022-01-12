@org.junit.Test
public void nameEmptyTest() {
    expected.expect(java.lang.IllegalArgumentException.class);
    movie = new cz.muni.fi.pb138.odskart.backend.Movie("");
}
@org.junit.Test(expected = java.lang.Exception.class)
public void testCreateMapThrowsException() throws java.lang.Exception {
    org.group17.bubblebobble.MapReader.createMap("wrongfilename.txt");
}
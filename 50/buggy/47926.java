@org.junit.Test
public void testGameMapReaderIsNotNull() throws java.lang.Exception {
    org.group17.bubblebobble.MapReader mp = new org.group17.bubblebobble.MapReader();
    org.junit.Assert.assertNotNull(mp.gameMapReader("testLevel.txt"));
}
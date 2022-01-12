@org.junit.Test
public void testGameMapReaderGivesFalseResult() throws java.lang.Exception {
    org.group17.bubblebobble.MapReader mp = new org.group17.bubblebobble.MapReader();
    java.util.ArrayList<java.lang.String> alInformation = new java.util.ArrayList<java.lang.String>();
    alInformation.add("3");
    alInformation.add("3");
    alInformation.add("XXX");
    alInformation.add("XX");
    alInformation.add("XXX");
    org.junit.Assert.assertFalse((alInformation == (mp.gameMapReader("testLevel.txt"))));
}
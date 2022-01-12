@org.junit.Test
public void testGameMapReaderGivesFalseResult() throws java.lang.Exception {
    java.util.ArrayList<java.lang.String> alInformation = new java.util.ArrayList<java.lang.String>();
    alInformation.add("3");
    alInformation.add("3");
    alInformation.add("XXX");
    alInformation.add("XX");
    alInformation.add("XXX");
    org.junit.Assert.assertFalse((alInformation == (org.group17.bubblebobble.MapReader.gameMapReader("testLevel.txt"))));
}
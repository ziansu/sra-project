@org.junit.Test
public void testGameMapReaderGivesCorrectResult() throws java.lang.Exception {
    java.util.ArrayList<java.lang.String> alInformation = new java.util.ArrayList<java.lang.String>();
    alInformation.add("3");
    alInformation.add("3");
    alInformation.add("XXX");
    alInformation.add("X X");
    alInformation.add("XXX");
    org.junit.Assert.assertEquals(alInformation, org.group17.bubblebobble.MapReader.gameMapReader("testLevel.txt"));
}
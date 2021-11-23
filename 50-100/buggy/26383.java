@org.junit.Test
public void testGameMapReaderGivesCorrectResult() throws java.lang.Exception {
    org.group17.bubblebobble.MapReader mp = new org.group17.bubblebobble.MapReader();
    java.util.ArrayList<java.lang.String> alInformation = new java.util.ArrayList<java.lang.String>();
    alInformation.add("3");
    alInformation.add("3");
    alInformation.add("XXX");
    alInformation.add("X X");
    alInformation.add("XXX");
    org.junit.Assert.assertEquals(alInformation, mp.gameMapReader("testLevel.txt"));
}
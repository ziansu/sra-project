@org.junit.Test
public void testGetCharBoardReadsACharacter() {
    java.util.ArrayList<java.lang.String> alList = new java.util.ArrayList<java.lang.String>();
    alList.add("1");
    alList.add("1");
    alList.add("a");
    char[][] cMap = org.group17.bubblebobble.MapReader.getCharBoard(alList);
    org.junit.Assert.assertEquals('a', cMap[0][0]);
}
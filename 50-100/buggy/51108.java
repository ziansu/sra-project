@org.junit.Test
public void testGetCharBoardReadsACharacter() {
    org.group17.bubblebobble.MapReader mp = new org.group17.bubblebobble.MapReader();
    java.util.ArrayList<java.lang.String> alList = new java.util.ArrayList<java.lang.String>();
    alList.add("1");
    alList.add("1");
    alList.add("a");
    char[][] cMap = mp.getCharBoard(alList);
    org.junit.Assert.assertEquals('a', cMap[0][0]);
}
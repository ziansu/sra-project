@Test
public void testBadCorners() {
    java.lang.String[] cornerWords = new java.lang.String[]{ "notary" , "urine" , "need" , "diners" , "astride" , "nosier" };
    BoggleBoard board = myMaker.makeBoard(4);
    java.lang.System.out.println(board.toString());
    for (java.lang.String s : cornerWords) {
        java.util.List<BoardCell> list = myFinder.cellsForWord(board, s);
        java.lang.String word = getWord(board, list);
        assertNotSame(("fail for " + s), s, word);
    }
}
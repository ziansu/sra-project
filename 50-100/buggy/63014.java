private boolean askForClue(assignment2.Decoder decode, java.lang.String guess, assignment2.Board historyBoard) {
    boolean win;
    win = decode.makeClue();
    if (win)
        return true;
    
    java.lang.String summary = ((((guess + " -> ") + (decode.getBlack())) + "b_") + (decode.getWhite())) + "w";
    historyBoard.addToHistory(summary);
    java.lang.System.out.println(summary);
    java.lang.System.out.println();
    return win;
}
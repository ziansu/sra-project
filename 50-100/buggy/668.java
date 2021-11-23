public void addLetter(java.lang.String letter) {
    if ((currentColumn) == (com.koda.lingo.logic.Board.WORD_LENGTH))
        return ;
    
    com.koda.lingo.Lingo.log(("Adding letter " + letter));
    com.koda.lingo.logic.Tile t = getTile(currentRow, currentColumn);
    t.setValue(letter);
    (currentColumn)++;
    cursor.setPosition(currentRow, currentColumn);
}
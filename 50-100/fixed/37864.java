public boolean genBoardArrangement(int difficulty) {
    squares = roller.genBoard();
    valid = new com.example.swathi.gameboggle.ValidWords(squares, difficulty, dictionary);
    while (!(valid.checkValidBoard())) {
        squares = roller.genBoard();
        valid = new com.example.swathi.gameboggle.ValidWords(squares, difficulty, dictionary);
    } 
    return true;
}
private void setupGame() throws com.rostifar.gamecontrol.ScrabbleGameException {
    java.lang.System.out.println("Setting up Scrabble game...");
    loadConfig();
    scrabbleBoard = new com.rostifar.scabbleboard.ScrabbleBoard();
    java.lang.System.out.println(scrabbleBoard);
}
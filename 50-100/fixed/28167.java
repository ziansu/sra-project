public static void again() {
    hangman.Game.inputScan();
    if (hangman.Game.input.equals("Y")) {
        hangman.Game.reset();
    }else
        if (hangman.Game.input.equals("N")) {
            hangman.Game.gameState = 2;
        }else {
            hangman.Game.error(2);
            hangman.Game.again();
        }
    
}
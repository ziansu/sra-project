public static boolean guessPuzzle(wheeloffortune.PuzzleBoard puzzle) {
    boolean gameOverFlag = false;
    java.lang.String letterGuess;
    java.lang.System.out.println("Please print out your guess of the board. If you guess a letter wrong you lose.");
    while (true) {
        puzzle.getPuzzleBoard();
        letterGuess = wheeloffortune.WheelOfFortune.getLetter(puzzle).toUpperCase();
        puzzle.guessLetter(letterGuess);
        if ((puzzle.checkLetterContained(letterGuess)) == false) {
            java.lang.System.out.println("Wrong. Game over.");
            gameOverFlag = true;
            break;
        }
        gameOverFlag = puzzle.getWinFlag();
        if (gameOverFlag) {
            break;
        }
    } 
    return gameOverFlag;
}
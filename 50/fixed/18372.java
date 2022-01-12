public static void main(java.lang.String[] args) {
    hangman.Hangman game = new hangman.Hangman();
    hangman.Player player = new console.LocalPlayer();
    game.playGame(player);
}
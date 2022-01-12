@org.junit.Test
public void AddLetterToGuessedListAfterGuess() {
    com.hangman.players.YourPlayer player = new com.hangman.players.YourPlayer();
    player.GetGuess(java.util.Arrays.asList('_', '_', '_'));
    java.util.List<java.lang.Character> guessedLetters = player.GetGuessedLetters();
    java.util.List<java.lang.Character> expectedList = new java.util.ArrayList<java.lang.Character>();
    expectedList.add('a');
    org.junit.Assert.assertEquals(expectedList, guessedLetters);
}
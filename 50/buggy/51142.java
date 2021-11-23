@org.junit.Test
public void GuessesAWhenThereAreSuccessfulCharactersGuessedThatAreNotA() {
    com.hangman.players.YourPlayer player = new com.hangman.players.YourPlayer();
    char guess = player.GetGuess(java.util.Arrays.asList('m', '_', 'n'));
    org.junit.Assert.assertEquals('a', guess);
}
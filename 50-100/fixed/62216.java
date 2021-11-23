private void lostGame(boolean quietMode) {
    imageLabel.setIcon(game.getActor().getImageArray()[game.maxGuesses()]);
    (gamesPlayed)++;
    if (!quietMode) {
        gameEnded((("Sorry! \"" + (utilities.functions.StringUtilities.asSentence(game.getCurrentWord()))) + "\" was the correct word!"), "Loser!");
    }
}
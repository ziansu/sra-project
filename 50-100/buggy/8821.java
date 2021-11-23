private void updateLabels() {
    if ((game.mode) == "practice") {
        gamePanel.setCurrentWordCount(game.getWordCount());
    }
    gamePanel.setCurrentWordLabel(game.currentWord, game.currentCorrectIndex);
    if ((game.difficulty) <= 2) {
        gamePanel.setCurrentTypedWordLabel(game.currentTypedWord, game.currentIndex, game.currentCorrectIndex);
    }
}
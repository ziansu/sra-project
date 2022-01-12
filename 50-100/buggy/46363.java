public void startNewGame(boolean submitWord) {
    if (submitWord) {
        view.MainWindow.submitWordOnQuit();
    }
    algorithm.HangmanSolver.proposedSolutions.clear();
    applyButton.setDisable(true);
    languageSelector.setDisable(false);
    currentSequence.setText("");
    proposedSolutions.setText("");
    setThought("");
    result.setText("");
    currentSequence.requestFocus();
}
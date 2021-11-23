public void restartGame() {
    this.solution = new core.Word(words.getNextLingoWord());
    screen.lingo.setSolution(solution);
    guessCounter = 0;
    checker = new core.Checker(this.solution);
    screen.reset();
    screen.lingo.addHint(checker.getNextHint(screen.lingo.getCurrentHints(), false));
}
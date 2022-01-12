public final void nextLevel() {
    (levelCount)++;
    int score1 = 0;
    if ((board) != null) {
        score1 = score.getScore();
    }
    level = new gamelogic.Level(((levelCount) + 1), score1);
    level.addObserver(this);
    board = new gamelogic.Board();
    level.start();
}
@java.lang.Override
public void startNewGame(int numberOfRowsAndCols, int numberOfMines) {
    try {
        this.grid = new de.htwg.se.minesweeper.model.Grid(numberOfRowsAndCols, numberOfRowsAndCols, numberOfMines);
        this.state = State.NEW_GAME;
        this.timeOfGameStartMills = java.lang.System.currentTimeMillis();
    } catch (java.lang.Exception e) {
        state = State.ERROR;
    } finally {
        notifyObservers();
    }
}
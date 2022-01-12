@java.lang.Override
public void handle(long now) {
    time += 0.015;
    if (((time) >= 0.5) && (!(board.checkBoardFull()))) {
        time = 0;
        update(grid, sideGrid, preview, scoreLabel, false);
    }
    if (board.checkBoardFull()) {
        scene.setOnKeyPressed(null);
        displayGameOver(layoutGrid, this);
    }
}
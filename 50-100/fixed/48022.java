@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    if (!(getCellManager().lose)) {
        cellManager.draw(canvas);
        if ((32 == (cellManager.getTheLargestNumber())) && (isWinActivityShowed)) {
            showWinActivity(cellManager.getScores());
            isWinActivityShowed = false;
        }
    }else {
        cellManager.startNewGame();
        cellManager.draw(canvas);
        showLoseActivity(cellManager.getScores());
    }
}
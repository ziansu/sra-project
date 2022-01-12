public void stop() {
    timerTask.cancel();
    int rowIndex = 0;
    while ((rowIndex < 6) && (rowIndex < (destinationRowIndex))) {
        gameBoardTable.get(rowIndex).getChildAt(col).setBackgroundResource(R.drawable.rounded_corner_white);
        rowIndex++;
    } 
    evaluateGame();
    if (!(finishedGame)) {
        gameBoardTable.get(destinationRowIndex).getChildAt(col).setBackgroundResource(drawableId);
    }
}
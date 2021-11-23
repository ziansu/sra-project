public void stop() {
    timerTask.cancel();
    evaluateGame();
    rowIndex = 0;
    while (((rowIndex) < 6) && ((rowIndex) < (destinationRowIndex))) {
        gameBoardTable.get(rowIndex).getChildAt(col).setBackgroundResource(R.drawable.rounded_corner_white);
        (rowIndex)++;
    } 
    if (!(finishedGame))
        gameBoardTable.get(destinationRowIndex).getChildAt(col).setBackgroundResource(drawableId);
    
}
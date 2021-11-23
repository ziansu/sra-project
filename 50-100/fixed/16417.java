@java.lang.Override
public void onClick(android.view.View view) {
    com.example.amit.minesweeper.Block block = ((com.example.amit.minesweeper.Block) (view));
    if (block.hasMine()) {
        state = com.example.amit.minesweeper.Board.eState.LOSE;
    }else
        if ((numOfPressedBlocks) == ((totalNumOfBlocks) - (numOfMines))) {
            state = com.example.amit.minesweeper.Board.eState.WIN;
        }
    
    pressNeighbours(block.getRow(), block.getCol());
    boardListener.onUpdate(numOfPressedBlocks, numOfFlags, state);
}
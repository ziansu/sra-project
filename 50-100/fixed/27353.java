@java.lang.Override
public boolean onLongClick(android.view.View view) {
    com.example.amit.minesweeper.Block block = ((com.example.amit.minesweeper.Block) (view));
    if ((block.hasMine()) && (!(block.isFlagged())))
        (numOfGoodFlags)++;
    
    if (block.isFlagged())
        (numOfFlags)--;
    else
        (numOfFlags)++;
    
    block.markFlag();
    boardListener.onUpdate(numOfPressedBlocks, numOfFlags, state);
    return true;
}
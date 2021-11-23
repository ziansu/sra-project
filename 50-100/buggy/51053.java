@java.lang.Override
public void onClick(android.view.View v) {
    if ((mBoard[position].getBody()) == (Cell.CellBody.mine)) {
        mBoard[position].getImageView().setImageResource(R.drawable.mine);
        gameOver();
        return ;
    }
    if (((mBoard[position].getState()) == (Cell.CellState.opened)) || ((mBoard[position].getState()) == (Cell.CellState.flag)))
        return ;
    
    revealCells(position);
    checkIfWin();
}
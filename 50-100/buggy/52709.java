private void updateBoard(balance.Square[][] board) {
    updateFire();
    updateTree();
    updateCity();
    for (int i = 0; i < (balance.Game.ROWS); ++i)
        for (int j = 0; j < (balance.Game.COLUMNS); ++j)
            board[i][j].update(buttons[i][j]);
        
    
}
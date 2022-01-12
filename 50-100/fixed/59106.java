private int checkImmidiateFour(neu.Token player, neu.Token[][] board) {
    for (int col : cols)
        if ((colHeight(col)) < (neu.ComputerPlayer.ROWS)) {
            neu.Token[][] copiedBoard = insertToken(col, player, getCopyOfBoard(board));
            if (checkPossibleVierGewinnt(col, ((neu.ComputerPlayer.colHeight(copiedBoard, col)) - 1), player, copiedBoard))
                return col;
            
        }
    
    return -1;
}
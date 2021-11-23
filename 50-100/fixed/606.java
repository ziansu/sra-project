public boolean[] getAllowedMoves(int iSrc) {
    boolean[] bReturn;
    bReturn = new boolean[_board.length];
    for (int i = 0; i < (_board.length); i++) {
        int iCount = java.lang.Math.abs((i - iSrc));
        if ((movePiece(iSrc, iCount, true)) == (com.MagikSquirrel.backgammon.gameBoard.MoveMsg.VALID_TEST)) {
            bReturn[i] = true;
        }else {
            bReturn[i] = false;
        }
    }
    return bReturn;
}
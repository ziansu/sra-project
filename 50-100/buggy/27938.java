private void checkPos(int chessType, OtrioOL.Chessboard board) {
    for (int i = 0; i < (putable.get(chessType).size()); i++) {
        if ((board.getBoard(i).get(chessType)) != 0) {
            putable.get(chessType).remove(i);
        }
    }
}
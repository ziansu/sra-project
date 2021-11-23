@java.lang.Override
public int nextMove() {
    for (main.java.com.kaasintl.reversi.ReversiField field : ReversiGameBoard.board) {
        if (((field.getState()) == 0) && (isValid(field))) {
            return field.getCoordinate();
        }
    }
    return -99;
}
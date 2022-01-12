@java.lang.SuppressWarnings(value = "magicnumber")
public boolean hasChain() {
    for (int y = 0; y < (board.Board.BOARDSIZE); y++) {
        for (int x = 0; x < (board.Board.BOARDSIZE); x++) {
            for (int i = 1; i < 3; i++) {
                board.Direction dir = Direction.DIRECTIONS.get(i);
                if (isTripletInDir(x, y, dir)) {
                    return true;
                }
            }
        }
    }
    return false;
}
public boolean isFull() {
    boolean full = false;
    int column = 0;
    while (column <= (nl.utwente.iapc.IAPConnect4.model.game.Board.BOARDWIDTH)) {
        full = full && ((getColumnSize(column)) == ((nl.utwente.iapc.IAPConnect4.model.game.Board.BOARDHEIGHT)++));
        column++;
    } 
    return full;
}
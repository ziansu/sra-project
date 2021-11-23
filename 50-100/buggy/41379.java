@java.lang.Override
public boolean move(Board board, int xStart, int yStart, int xEnd, int yEnd) {
    if ((strategy) == 1) {
        return randomMove(board, xStart, yStart, xEnd, yEnd);
    }else
        if ((strategy) == 2) {
            return protectKingMove(board, xStart, yStart, xEnd, yEnd);
        }
    
    return false;
}
private static boolean isPathClearSameRank(final boolean towardKingside, final int startIndex, final int endIndex, final com.williamdye.dyce.board.Square[] squares) {
    boolean clear = true;
    if (towardKingside) {
        for (int i = startIndex + 1; i < endIndex; i++)
            clear &= squares[i].isEmpty();
        
    }else {
        for (int i = endIndex - 1; i > startIndex; i--)
            clear &= squares[i].isEmpty();
        
    }
    return clear;
}
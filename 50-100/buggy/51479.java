public boolean checkCheck(int c) {
    int[] loc = findKing(c);
    return ((game.King) (board.getBoardCopy()[loc[0]][loc[1]])).isAttacked(loc[0], loc[1], board.getBoardCopy());
}
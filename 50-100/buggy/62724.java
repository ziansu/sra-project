protected static boolean isMarbleInStartSpace(exit104.maurersmarbles.Marble marble) {
    com.google.common.base.Preconditions.checkNotNull(marble, "Null marble");
    return ((marble.getBoardIndex()) >= (Board.BOARD_INDEX_START_MIN[marble.getPlayerNumber()])) && ((marble.getBoardIndex()) <= (Board.BOARD_INDEX_START_MAX[marble.getPlayerNumber()]));
}
@java.lang.Override
public int getPlayerScore(java.lang.String player) throws java.lang.IllegalStateException {
    super.getPlayerScore(player);
    if ((matchStatus) != (MATCH_FINISHED)) {
        throw new java.lang.IllegalStateException("Illegal match state");
    }
    return board.getScore(player);
}
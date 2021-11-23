protected boolean setRemainingMoves(int moves) {
    boolean changed = moves != (getRemainingMoves());
    getPreferencesManager().setEntry(EntryType.INTEGER, shuffle.fwk.ShuffleModel.KEY_MOVES_REMAINING, moves);
    return changed;
}
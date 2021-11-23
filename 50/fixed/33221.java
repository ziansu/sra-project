protected boolean setRemainingMoves(int moves) {
    return getPreferencesManager().setEntry(EntryType.INTEGER, shuffle.fwk.ShuffleModel.KEY_MOVES_REMAINING, moves);
}
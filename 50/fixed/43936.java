public static connectn.Action get(byte player, int column, int moveType) {
    return connectn.Action.actions[(player - 1)][column][moveType];
}
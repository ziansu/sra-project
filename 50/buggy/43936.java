public static connectn.Action getAction(byte player, int column, int moveType) {
    return connectn.Action.actions[(player - 1)][column][moveType];
}
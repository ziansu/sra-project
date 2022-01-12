private static int utility(State state, int winner) {
    int playerId = state.getPlayerId();
    int utility;
    switch (winner) {
        case 1 :
            utility = (playerId == winner) ? 2 : -2;
            break;
        case 2 :
            utility = (playerId == winner) ? 2 : -2;
            break;
        default :
            utility = 0;
            break;
    }
    return utility;
}
private static int utility(State state) {
    int winner = state.checkWin();
    int playerId = state.getPlayerId();
    int utility;
    switch (winner) {
        case 0 :
            utility = 1;
            break;
        case 1 :
            utility = (playerId == 1) ? 2 : -2;
            break;
        case 2 :
            utility = (playerId == 2) ? 2 : -2;
            break;
        default :
            utility = 0;
            break;
    }
    return utility;
}
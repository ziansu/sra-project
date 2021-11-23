@java.lang.Override
public int treasureValue(server.Game game) {
    if (!(game.currentPlayer().playedFoolsGoldThisTurn)) {
        return 1;
    }else {
        return 4;
    }
}
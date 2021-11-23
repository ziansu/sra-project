public static game.entities.Army getArmy(game.gameboard.Location location, int playerId, game.entities.RallyPoint rp, java.util.ArrayList<? extends game.entities.factories.Unit> units) {
    return new game.entities.Army(location, playerId, rp, units);
}
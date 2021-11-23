public static game.entities.Army getArmy(int playerId, game.entities.RallyPoint rp, java.util.ArrayList<? extends game.entities.factories.Unit> units) {
    return new game.entities.Army(playerId, rp, units);
}
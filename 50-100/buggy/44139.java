public java.util.List<engine.jaxb.schema.generated.Player> getPlayers() throws engine.NumberOfPlayersException {
    java.util.List<engine.jaxb.schema.generated.Player> players = this.players.getPlayer();
    if ((players.size()) != 2) {
        throw new engine.NumberOfPlayersException(players.size(), engine.jaxb.schema.generated.Player.MIN_PLAYERS, engine.jaxb.schema.generated.Player.MAX_PLAYERS);
    }
    return players;
}
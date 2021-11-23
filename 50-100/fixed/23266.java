private void loadPlayers() throws java.sql.SQLException {
    players = new entity.Player[sql.countPlayers()];
    for (int i = 0; i < (players.length); i++) {
        players[i] = new entity.Player(sql.getPlayerName((i + 1)), sql.getVehicleColour((i + 1)), sql.getVehicleType((i + 1)), sql);
        sql.setBalance(players[i]);
    }
}
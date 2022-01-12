private void loadPlayers(boundary.SQL sql) throws java.sql.SQLException {
    for (int i = 0; i < (sql.countPlayers()); i++) {
        players[i] = new entity.Player(sql.getPlayerName((i + 1)), sql.getVehicleColour((i + 1)), sql.getVehicleType((i + 1)), sql);
        sql.setBalance(players[i]);
    }
}
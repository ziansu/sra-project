public static boolean changePlayerRole(java.util.UUID uuid, murdermystery.roles.Role role) {
    for (java.lang.Integer i = 0; i < (murdermystery.game.GameManager.games.size()); i++) {
        murdermystery.game.Game game = murdermystery.game.GameManager.games.get(i);
        if ((game.players.get(uuid)) != null) {
            game.players.remove(uuid);
            game.players.put(uuid, new murdermystery.game.GamePlayer(role, org.bukkit.Bukkit.getPlayer(uuid)));
            return true;
        }
    }
    return false;
}
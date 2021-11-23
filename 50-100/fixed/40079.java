public static boolean worldIsGameWorld(org.bukkit.World world) {
    for (int i = 0; i < (murdermystery.game.GameManager.games.size()); i++) {
        murdermystery.game.Game game = murdermystery.game.GameManager.games.get(i);
        if ((game.world) == world) {
            return true;
        }
    }
    return false;
}
public static boolean isGameExistent(java.lang.String game, org.bukkit.configuration.file.FileConfiguration fileConfiguration) {
    int i = 0;
    int imax = org.kwstudios.play.ragemode.toolbox.GetGames.getConfigGamesCount(fileConfiguration);
    java.lang.String[] games = org.kwstudios.play.ragemode.toolbox.GetGames.getGameNames(fileConfiguration);
    while (i < imax) {
        if (games[i].equals(game)) {
            return true;
        }
    } 
    return false;
}
public static int getOverallMaxPlayers(org.bukkit.configuration.file.FileConfiguration fileConfiguration) {
    int i = 0;
    int n = 0;
    int x;
    java.lang.String[] names = org.kwstudios.play.ragemode.toolbox.GetGames.getGameNames(fileConfiguration);
    while (i <= (org.kwstudios.play.ragemode.toolbox.GetGames.getGameNames(fileConfiguration).length)) {
        x = org.kwstudios.play.ragemode.toolbox.ConfigFactory.getInt(("settings.games." + (names[i])), "maxplayers", fileConfiguration);
        if (n < x)
            n = x;
        
        i++;
    } 
    return n;
}
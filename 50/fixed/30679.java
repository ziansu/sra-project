public static void removePlayer(org.bukkit.entity.Player player) {
    if ((theweekend.visual.TopBar.lastBar) == null) {
        return ;
    }
    if (theweekend.visual.TopBar.lastBar.getPlayers().contains(player)) {
        theweekend.visual.TopBar.lastBar.removePlayer(player);
    }
}
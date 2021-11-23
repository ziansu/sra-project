public static void addPlayer(org.bukkit.entity.Player player) {
    if (!(me.Niek1e.Freerunning.utilities.Players.allPlayers.contains(player))) {
        me.Niek1e.Freerunning.utilities.Players.allPlayers.add(player);
    }
    if ((me.Niek1e.Freerunning.utilities.Players.getAllPlayers().size()) == 1) {
        me.Niek1e.Freerunning.utilities.StartCountdown.getCurrentGame().canStart(true);
    }
}
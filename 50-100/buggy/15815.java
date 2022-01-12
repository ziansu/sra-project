@java.lang.Override
public void run() {
    java.lang.String winner = battle.getWinner();
    (countdownLootTime)++;
    if ((countdownLootTime) == (countdownLoot)) {
        org.bukkit.Bukkit.getScheduler().cancelTask(countdownLootTask);
        getPlayer(winner).teleport(battle.getWinnerLocation());
    }
    int remaining = (countdownLoot) - (countdownLootTime);
    if (remaining < 4)
        messenger.broadcast((remaining + ".."));
    
}
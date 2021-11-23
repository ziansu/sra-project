@java.lang.Override
public void run() {
    (countdownFightTime)++;
    if ((countdownFightTime) == (countdownBattle)) {
        org.bukkit.Bukkit.getScheduler().cancelTask(countdownFightTask);
        startFight();
    }
    int remaining = (countdownBattle) - (countdownFightTime);
    if (remaining < 4)
        messenger.broadcast((remaining + ".."));
    
}
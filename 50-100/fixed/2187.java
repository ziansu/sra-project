private void resetCoundown() {
    if ((countdownTask) != null) {
        countdownTask.cancel();
        countdownTask = null;
    }
    if ((playing.size()) >= (minimumPlayers)) {
        countdown = maxCountdown;
        countdownTask = org.bukkit.Bukkit.getScheduler().runTaskTimer(plugin, new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                countdownTick();
            }
        }, 100, 10);
    }else {
        broadcast(((com.yahoo.tracebachi.FloorIsLava.FloorArena.BAD) + "Too few players to start."), null);
    }
}
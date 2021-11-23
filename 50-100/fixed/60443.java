public void startTimer() {
    try {
        if (!(started)) {
            started = true;
            (seconds)++;
            timer = new com.zombies.game.AutoStart.Countdown(seconds);
            timer.run();
        }
    } catch (java.lang.Exception e) {
        try {
            for (org.bukkit.entity.Player pl : game.players) {
                com.zombies.CommandUtil.sendMessageToPlayer(pl, (("Error in joining " + (game.getName())) + ". Try rejoining!"));
            }
        } catch (java.lang.NullPointerException ex) {
        }
    }
}
public void startTimer() {
    try {
        if (((seconds) > 0) && (!(started))) {
            timer = new com.zombies.game.AutoStart.Countdown(seconds);
            timer.run();
            started = true;
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
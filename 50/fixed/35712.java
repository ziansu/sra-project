private static void informIdlePlayer() {
    synchronized(controllers.Application.playerListIdle) {
        for (model.Player player : new java.util.LinkedList<model.Player>(controllers.Application.playerListIdle)) {
            play.Logger.debug(("Refresh idle " + player));
            player.reload("/play");
        }
    }
}
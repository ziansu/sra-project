public void run(com.uawebchallenge.bomberman.game.model.Game game) {
    java.util.concurrent.ScheduledExecutorService scheduler = java.util.concurrent.Executors.newScheduledThreadPool(1);
    final int time = game.getGameConfig().getTimeBetweenFrames();
    final com.uawebchallenge.bomberman.game.control.impl.GameRunnable gameRunnable = new com.uawebchallenge.bomberman.game.control.impl.GameRunnable(gameMechanics, game, scheduler);
    try {
        java.util.concurrent.ScheduledFuture<?> handle = scheduler.scheduleAtFixedRate(gameRunnable, 0, time, java.util.concurrent.TimeUnit.MILLISECONDS);
        handle.get();
    } catch (java.lang.Exception e) {
        com.uawebchallenge.bomberman.game.control.impl.DefaultGameRunner.logger.error("Error while running game...", e);
    }
}
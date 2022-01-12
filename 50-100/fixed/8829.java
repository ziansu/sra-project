public void run() {
    train.addHistory(station, context.getGameLogic().getPlayerManager().getTurnNumber());
    java.lang.System.out.println(((("Added to history: passed " + (station.getName())) + " on turn ") + (context.getGameLogic().getPlayerManager().getTurnNumber())));
    junctionFailure(station);
    collisions(station);
    obstacleCollision(station);
}
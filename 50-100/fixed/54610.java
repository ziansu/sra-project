public void finish() {
    this.time.stop();
    int levelScore = java.lang.Math.max(0, ((1500 - (GameComponents.Game.count)) - (2 * (((GameComponents.Game.min) * 60) + (GameComponents.Game.sec)))));
    GameComponents.Game.deadBricks = 0;
    GameComponents.Game.count = 0;
    GameComponents.Game.min = 0;
    GameComponents.Game.sec = 0;
    this.controller.gameFinished(levelScore, bestScore);
}
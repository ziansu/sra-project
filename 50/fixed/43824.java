private boolean captureChancellor() {
    boolean b = io.github.teamfractal.RoboticonQuest.rnd.nextBoolean();
    if (b) {
        gameScreen.addAnimation(new io.github.teamfractal.animation.chancellor.WildChancellorAppear(this, skin));
    }
    return b;
}
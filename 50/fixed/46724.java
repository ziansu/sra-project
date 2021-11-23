public void update(float delta) {
    mX += (com.jamescho.game.model.Cloud.CLOUD_SPEED_X) * delta;
    if ((mX) <= (-200)) {
        mX += 1000;
        mY = com.jamescho.framework.util.RandomNumberGenerator.getRandIntBetween(20, 100);
    }
}
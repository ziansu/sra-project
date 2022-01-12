void basicAttack() {
    comboing = true;
    targetX = ((int) ((rand.nextDouble()) * (Gdx.graphics.getWidth())));
    targetY = ((int) ((rand.nextDouble()) * (Gdx.graphics.getHeight())));
    comboId = 0;
    tapTotal = 10;
    tapsLeft = tapTotal;
    allowedTime = 5000;
    startTime = com.badlogic.gdx.utils.TimeUtils.millis();
    return ;
}
private void attack1() {
    comboing = true;
    targetX = (((rand.nextDouble()) * (Gdx.graphics.getWidth())) / 2) + ((Gdx.graphics.getWidth()) / 3);
    targetY = (Gdx.graphics.getHeight()) / 2;
    startX = (Gdx.graphics.getWidth()) / 20;
    startTime = com.badlogic.gdx.utils.TimeUtils.millis();
    allowedTime = 3000;
}
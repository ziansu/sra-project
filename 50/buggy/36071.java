private void initPowerUp() {
    com.mycompany.app.models.AbstractPowerUp.randomPowerUp(level);
    powerUp.setPosition(PUStartPosition(findEmptyPositions(width, height, fixedPositions)));
}
private void initPowerUp() {
    randomPowerUp(level);
    powerUp.setPosition(PUStartPosition(findEmptyPositions(width, height, fixedPositions)));
}
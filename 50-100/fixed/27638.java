private void jump() {
    boolean isJumpCountLessThanTwo = (jumpCount) < 2;
    int heightOffsetWithYPosition = ((int) ((getPosition().y) + (height)));
    if (isJumpCountLessThanTwo || (heightOffsetWithYPosition == ((map.getHeight()) * (map.getTileHeight())))) {
        getMovement().y = -8;
        (jumpCount)++;
        changeState(jumpingState);
    }
    isJumping = false;
}
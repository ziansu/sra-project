public void cBounce(java.lang.Character c, int v) {
    c.setVelocity(c.velocityX, ((int) (((c.velocityY) * (-1)) + v)));
}
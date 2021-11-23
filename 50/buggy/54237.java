public void jump(float deltaTime) {
    if ((getPosition().getY()) == 0) {
        isOnGround = false;
        setVelocityY(1000.0F);
    }
}
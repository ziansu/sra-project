public void moveLeft() {
    collided();
    if ((canMoveLeft) && (!(collided())))
        speedx = -6;
    else
        speedx = 0;
    
}
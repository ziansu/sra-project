public void moveLeft() {
    if ((canMoveLeft) && (!(collided())))
        speedx = -6;
    else
        speedx = 0;
    
}
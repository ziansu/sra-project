public void move() {
    location = getGame().calculateNewPosition(this.location, getVelocity(), (360 - (angle)));
}
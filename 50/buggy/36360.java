public void setSpeed(long speed) {
    if ((speed < 1) || (speed > 10)) {
        return ;
    }
    this.speed = 100 / speed;
}
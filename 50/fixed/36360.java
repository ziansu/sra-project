public void setSpeed(long speed) {
    synchronized(this) {
        if ((speed < 1) || (speed > 10)) {
            return ;
        }
        this.speed = 100 / speed;
    }
}
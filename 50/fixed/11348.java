public void decelerate(int amount) {
    int speed = (this.speed) - amount;
    if (speed <= 0) {
        this.speed = 0;
    }else {
        this.speed = speed;
    }
}
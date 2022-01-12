public void decelerate(int amount) {
    int speed = (this.maxSpeed) - amount;
    if (speed <= 0) {
        this.speed = 0;
    }else {
        this.speed = speed;
    }
}
void increaseSpeed() {
    double k = 1 / (speed);
    speed += acs;
    k *= speed;
    v = v.mul(k);
}
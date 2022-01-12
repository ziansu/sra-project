public void update() {
    deg += 10 * (dir);
    if (((deg) >= 90) || ((deg) <= 0)) {
        dir = 0;
    }
}
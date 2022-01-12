void move() {
    if (((y) - (ya)) < (-150)) {
        Game.hasShot = false;
        Game.missiles.remove(this);
    }
    if (collision()) {
    }
    x = (x) - (xa);
    y = (y) - (ya);
}
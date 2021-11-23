void move() {
    if (((y) - (ya)) < (-150)) {
        java.lang.System.out.println("Missile reached the top");
        Game.hasShot = false;
        Game.missiles.remove(this);
    }
    if (collision()) {
    }
    x = (x) - (xa);
    y = (y) - (ya);
}
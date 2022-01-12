public void update() {
    if ((type) == (Type.BASICENEMY)) {
        (timer)++;
        this.move(Direction.DOWN, speed);
        int timeToShoot = rnd.nextInt(3);
        if ((timeToShoot == 0) && (((timer) % 100) == 0)) {
            Sound.play("src/sounds/enemyBlaster.wav");
            shoot(Type.BULLET, Direction.DOWN);
            timer = 0;
        }
    }
}
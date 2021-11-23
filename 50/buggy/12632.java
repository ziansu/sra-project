void Fire() {
    com.shooter.game.Bullet bullet = new com.shooter.game.Bullet(ship.pos.cpy());
    bulletList.add(bullet);
}
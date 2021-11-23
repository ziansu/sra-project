public void reset() {
    this.player.reset();
    this.level = 0;
    this.mode = 0;
    model.enemy.Enemy.reset();
    model.Bullet.reset();
}
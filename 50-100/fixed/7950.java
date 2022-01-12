public void update(int x, int y, double r, java.util.ArrayList<zombienado_v1.server.serverUnits.ServerZombie> zombies, java.util.ArrayList<java.awt.Point> walls) {
    if ((health) <= 0) {
        isDead = true;
    }
    int xOld = this.x;
    int yOld = this.y;
    this.x += x;
    this.y += y;
    this.r = r;
    checkWallsCollisions(xOld, yOld, walls);
    checkDamageTaking(zombies);
}
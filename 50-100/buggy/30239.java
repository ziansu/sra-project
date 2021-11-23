@java.lang.Override
public void tick() {
    menu.tick();
    if (menu.active)
        return ;
    
    velx += 0.4 * (direction);
    x += this.velx;
    this.collisionCheck(velx, 0);
    y += this.vely;
    this.collisionCheck(0, vely);
    this.velx /= 1.2;
    vely += 0.3;
}
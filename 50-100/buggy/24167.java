public synchronized void shoot() {
    if ((bTimer) > 0)
        return ;
    
    getPoly();
    bullets.add(new core.Bullet(((int) (tip.getX())), ((int) (tip.getY())), angle, 5));
    bullets.lastElement().move();
    bTimer = 10;
}
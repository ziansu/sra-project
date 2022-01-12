public void move(int dx, int dy) {
    if ((dx != 0) && (dy != 0)) {
        move(dx, 0);
        move(0, dy);
        return ;
    }
    if (!(collision())) {
        this.x += dx;
        this.y += dy;
    }
}
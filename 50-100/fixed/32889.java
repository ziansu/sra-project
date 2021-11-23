public void paint(org.newdawn.slick.Graphics g, double xp, double yp) {
    picture.draw(((x) - ((int) (xp))), ((y) - ((int) (yp))));
    this.xp = xp;
    this.yp = yp;
    if (mouseMoved) {
        paintMouseOver(g, xp, yp);
    }
}
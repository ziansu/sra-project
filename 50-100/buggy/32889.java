public void paint(org.newdawn.slick.Graphics g, double xp, double yp) {
    picture.draw(((x) - ((int) (xp))), ((y) - ((int) (yp))));
    if (mouseMoved) {
        paintMouseOver(g, xp, yp);
    }
}
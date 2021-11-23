@java.lang.Override
public void paint(org.newdawn.slick.Graphics g, double xp, double yp) {
    getImage().draw(((x) - ((int) (xp))), ((y) - ((int) (yp))));
    if (mouseMoved) {
        paintMouseOver(g, xp, yp);
    }
}
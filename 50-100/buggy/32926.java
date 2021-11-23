@java.lang.Override
public synchronized void paint(java.awt.Graphics g) {
    java.awt.Graphics2D g2d = ((java.awt.Graphics2D) (g));
    int[] background = getBackgroundImage();
    int[] userBackground = getUserMapImage(background);
    drawUserSkeleton(g2d);
    drawBackground(g, userBackground);
    drawStatus(g2d);
    coordinate = new java.util.ArrayList<>();
}
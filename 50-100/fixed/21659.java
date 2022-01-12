public void paint(java.awt.Graphics g) {
    super.paint(g);
    if ((drawArtificalMouseCursor) && (moveBackCursor)) {
        g.drawImage(mousePointer, lastSure.x, lastSure.y, null);
    }
    g.drawImage(im, 0, 0, null);
}
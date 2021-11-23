public void paint(java.awt.Graphics g) {
    if ((drawArtificalMouseCursor) && (moveBackCursor)) {
        super.paint(g);
        g.drawImage(mousePointer, lastSure.x, lastSure.y, null);
    }else
        if (!(isDone)) {
            super.paint(g);
        }
    
    g.drawImage(im, 0, 0, null);
}
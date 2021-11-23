public void render(java.awt.Graphics2D g) {
    if ((score) > ((Pong.pong.scoreLimit) - 2)) {
        if (((Pong.pong.paintingCount) % 30) == 0) {
            c = java.awt.Color.MAGENTA;
        }else
            if (((Pong.pong.paintingCount) % 15) == 0) {
                c = java.awt.Color.YELLOW;
            }
        
    }else {
        c = java.awt.Color.CYAN;
    }
    g.setColor(c);
    g.drawRect(x, y, width, height);
}
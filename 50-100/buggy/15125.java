public void drawBranch(java.awt.Graphics g) {
    drawLimb(g, this);
    if (subLimbs.isEmpty())
        return ;
    
    for (int i = subLimbs.size(); i > 0; i--) {
        drawLimb(g, subLimbs.get(i));
    }
}
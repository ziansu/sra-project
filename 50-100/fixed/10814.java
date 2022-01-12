@java.lang.Override
public void render(java.awt.Graphics g) {
    if (((this.width) == 30) && ((this.height) == 30)) {
        g.setColor(java.awt.Color.RED);
        g.drawRect(x, y, width, height);
    }else {
        g.setColor(java.awt.Color.RED);
        g.drawRect(x, y, width, height);
    }
}
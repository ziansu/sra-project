public void paint(java.awt.Graphics2D g2d) {
    if (this.visible) {
        g2d.setColor(this.color);
        if (((this.transformTimer) >= 0) || ((this.mergeTimer) >= 0)) {
            g2d.fillRect(this.tempX, this.tempY, this.tempWidth, this.tempHeight);
        }else {
            g2d.fillRect(this.x, this.y, this.width, this.height);
        }
    }
}
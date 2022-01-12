public void drawTo(java.awt.Graphics g, java.applet.Applet a) {
    g.drawPolygon(this.updateSection());
    for (Cardholder c : this.getCardholders()) {
        c.drawTo(g, a, this);
    }
    if (this.isActive()) {
        for (Cardholder c : this.getHand()) {
            c.drawTo(g, a, this);
        }
    }
}
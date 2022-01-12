public void drawTo(java.awt.Graphics g, java.applet.Applet a) {
    g.drawPolygon(this.updateSection());
    java.lang.System.out.println("drawing placeholders...");
    for (Cardholder c : this.getCardholders()) {
        c.drawTo(g, a, this);
    }
    if (this.isActive()) {
        java.lang.System.out.println(("Config.height = " + (Config.TABLEHEIGHT)));
        for (Cardholder c : this.getHand()) {
            c.drawTo(g, a, this);
        }
    }
}
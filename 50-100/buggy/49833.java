public void paintComponent(final java.awt.Graphics theGraphics) {
    super.paintComponent(theGraphics);
    final java.awt.Graphics2D g = ((java.awt.Graphics2D) (theGraphics));
    g.drawImage(model.GraphicsUtils.loadImg("images/icon.png"), 45, 35, 60, 60, null);
    g.setColor(java.awt.Color.WHITE);
    g.setFont(DIYPanel.HEADER_FONT);
    g.drawString("Welcome! Sign In or Create an Account", 120, 75);
    g.setFont(DIYPanel.MSG_FONT);
    g.drawString(myMessageToUser, 50, 300);
}
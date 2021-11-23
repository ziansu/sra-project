public void paintComponent(final java.awt.Graphics theGraphics) {
    super.paintComponent(theGraphics);
    final java.awt.Graphics2D g = ((java.awt.Graphics2D) (theGraphics));
    g.setColor(java.awt.Color.WHITE);
    g.setFont(DIYPanel.HEADER_FONT);
    g.drawString("Welcome! Sign In or Create an Account", 50, 75);
    g.setFont(DIYPanel.MSG_FONT);
    g.drawString(myMessageToUser, 50, 300);
}
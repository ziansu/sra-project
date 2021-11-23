private void alignCenterString(java.awt.Graphics g2d, java.lang.String s, int width, int XPos, int YPos, int fontSize) {
    g2d.setFont(new java.awt.Font(PathwaysFrameConstants.FONT_NAME, PathwaysFrameConstants.FONT_STYLE, fontSize));
    if (s != null) {
        s = displayString(s);
        int start = startX(g2d, s, width);
        g2d.drawString(s, (start + XPos), YPos);
    }
}
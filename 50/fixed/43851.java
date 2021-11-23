private void drawQRcode(org.newdawn.slick.Graphics g) {
    int margin = (screenWidth) / 38;
    g.drawImage(Sprites.controllerQR, (((screenWidth) - (Sprites.controllerQR.getWidth())) - margin), margin);
}
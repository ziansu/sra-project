public void paintComponent(java.awt.Graphics g) {
    int heightLocation = (this.point.getX()) * (view.SlotView.SLOTIMAGE_HEIGHT);
    int widthLocation = (this.point.getY()) * (view.SlotView.SLOTIMAGE_WIDTH);
    g.drawImage(this.slotImage, widthLocation, heightLocation, null);
}
public void spawnWaypoint(int offX, int offY) {
    java.awt.Graphics2D wp2d = backImage.createGraphics();
    wp2d.drawImage(this.getWaypoint(), (offX - ((this.getWaypoint().getWidth()) / 2)), (offY - ((this.getWaypoint().getHeight()) / 2)), null);
    updateGeneratedImage();
}
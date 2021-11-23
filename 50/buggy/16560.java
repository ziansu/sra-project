public void setNumberOfSectors(int numberOfSectors) {
    setAngle((360 / ((double) (getNumberOfSectors()))));
    this.numberOfSectors = numberOfSectors;
    repaint();
}
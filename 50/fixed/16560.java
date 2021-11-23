public void setNumberOfSectors(int numberOfSectors) {
    this.numberOfSectors = numberOfSectors;
    setAngle((360 / ((double) (getNumberOfSectors()))));
    repaint();
}
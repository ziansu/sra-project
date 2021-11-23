public void update(double blueCenterX, double redCenterX) {
    this.hasFinished = true;
    this.blueCenterX = blueCenterX;
    this.redCenterX = redCenterX;
    this.redIsRight = blueCenterX < redCenterX;
}
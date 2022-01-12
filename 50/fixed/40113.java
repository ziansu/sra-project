public void update(double redCenterX, double blueCenterX) {
    this.hasFinished = true;
    this.redCenterX = redCenterX;
    this.blueCenterX = blueCenterX;
    this.redIsRight = blueCenterX < redCenterX;
}
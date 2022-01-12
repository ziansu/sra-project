public void updatePosition(int centerPointX, int centerPointY) {
    this.setCenterPoint(new java.awt.Point((centerPointX - ((int) (this.getEndRadius()))), (centerPointY - ((int) (this.getEndRadius())))));
    area = createArea();
}
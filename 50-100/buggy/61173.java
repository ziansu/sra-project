public void updatePosition(int centerPointX, int centerPointY) {
    this.setCenterPoint(new java.awt.Point(((centerPointX - 8) - ((int) (this.getEndRadius()))), ((centerPointY - 30) - ((int) (this.getEndRadius())))));
    area = createArea();
}
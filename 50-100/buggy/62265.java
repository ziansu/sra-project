public double distanceTo(Point p) {
    double x = p.getCoordinates()[0];
    double y = p.getCoordinates()[1];
    return java.lang.Math.sqrt((((x - (this.x)) * (x - (this.x))) + ((y - (this.y)) * (y - (this.y)))));
}
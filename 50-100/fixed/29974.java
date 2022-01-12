public double getDistance() {
    return java.lang.Math.sqrt(((java.lang.Math.pow(((this.target.getCoordinate_point().getX()) - (this.start.getCoordinate_point().getX())), 2)) + (java.lang.Math.pow(((this.target.getCoordinate_point().getY()) - (this.start.getCoordinate_point().getY())), 2))));
}
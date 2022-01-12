public double distance(Pixel other) {
    double ycoord = java.lang.Math.abs(((row) - (other.getRow())));
    double xcoord = java.lang.Math.abs(((col) - (other.getCol())));
    return java.lang.Math.sqrt(((java.lang.Math.pow(ycoord, 2)) + (java.lang.Math.pow(xcoord, 2))));
}
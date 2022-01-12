public double distance(Pixel other) {
    double ycoord = (row) - (other.getRow());
    double xcoord = (col) - (other.getCol());
    return java.lang.Math.sqrt(((java.lang.Math.pow(ycoord, 2)) + (java.lang.Math.pow(xcoord, 2))));
}
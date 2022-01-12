public double getCurrentSpeedMag() {
    if (!(isMoving())) {
        return ((double) (0));
    }
    return java.lang.Math.sqrt((((java.lang.Math.pow(this.getCurrentSpeed().get(0), 2)) + (java.lang.Math.pow(this.getCurrentSpeed().get(1), 2))) + (java.lang.Math.pow(this.getCurrentSpeed().get(2), 2))));
}
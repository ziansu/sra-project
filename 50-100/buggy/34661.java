private void getDisplacementAndHeading(double[] data) {
    int leftTacho;
    int rightTacho;
    leftTacho = leftMotor.getTachoCount();
    rightTacho = rightMotor.getTachoCount();
    data[0] = (((leftTacho * (leftRadius)) + (rightTacho * (rightRadius))) * (java.lang.Math.PI)) / 360.0;
    data[1] = ((rightTacho * (rightRadius)) - (leftTacho * (leftRadius))) / (width);
}
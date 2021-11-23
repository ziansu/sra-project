private double checkDegrees(double degrees) {
    while (degrees < 0) {
        degrees = degrees + 360;
    } 
    while (degrees > 360) {
        degrees = degrees - 360;
    } 
    return degrees;
}
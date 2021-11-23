public static double rewrap(double theta) {
    while (theta > 180.0) {
        theta -= 360.0;
    } 
    while (theta < 180.0) {
        theta += 360.0;
    } 
    return theta;
}
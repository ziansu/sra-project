private double convertHeading(double in) {
    while (in < 0) {
        in += 360;
    } 
    in %= 360;
    if (in > 180) {
        return in - 360;
    }else {
        return in;
    }
}
void setAngleMangnitude(double a, double m) {
    angle = a;
    magnitude = m;
    if ((angle) > 90) {
        magnitude *= -1;
        angle = (angle) - 180;
    }else
        if ((angle) < (-90)) {
            magnitude *= -1;
            angle = (angle) + 180;
        }
    
}
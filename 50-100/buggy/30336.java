void setAngleMangnitude(double a, double m) {
    angle = a;
    magnitude = m;
    if (((this.angle) > 90) || ((this.angle) < (-90))) {
        this.magnitude *= -1;
        this.angle = (((this.angle) + 360) % 360) - 180;
    }
}
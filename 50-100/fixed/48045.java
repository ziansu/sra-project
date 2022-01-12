public void incrementAngle() {
    this.angle += java.lang.Math.toRadians(((2 * (java.lang.Math.PI)) / (this.period)));
    if ((this.angle) >= (2 * (java.lang.Math.PI))) {
        this.angle -= 2 * (java.lang.Math.PI);
    }
}
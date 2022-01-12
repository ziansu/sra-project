public void incrementAngle() {
    this.angle += (this.rotation) * (java.lang.Math.toRadians(((2 * (java.lang.Math.PI)) / (this.period))));
    if ((this.angle) >= (2 * (java.lang.Math.PI))) {
        this.angle -= 2 * (java.lang.Math.PI);
    }else
        if ((this.angle) < 0) {
            this.angle += 2 * (java.lang.Math.PI);
        }
    
}
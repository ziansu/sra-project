public void rotate(double winkel) {
    double radius = java.lang.Math.sqrt((((x) * (x)) + ((y) * (y))));
    this.x = radius * (java.lang.Math.sin(winkel));
    this.y = radius * (java.lang.Math.cos(winkel));
}
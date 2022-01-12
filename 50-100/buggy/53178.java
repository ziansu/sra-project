public void teleportToCircleEdge(double radius) {
    double angle = ((randomGen.nextDouble()) * (java.lang.Math.PI)) * 2;
    double xStep = (java.lang.Math.cos(angle)) * radius;
    double yStep = (java.lang.Math.sin(angle)) * radius;
    this.x += xStep;
    this.y += yStep;
}
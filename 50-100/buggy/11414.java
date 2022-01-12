protected synchronized void update() {
    xC += (getSpeed()) * (java.lang.Math.cos(getDirection()));
    x = (xC) - ((simulation.Car.WIDTH) / 2);
    yC += (getSpeed()) * (java.lang.Math.sin(getDirection()));
    y = (y) - ((simulation.Car.HEIGHT) / 2);
}
public void update(double time) {
    double offset = MainLoop.intersectRads.get(((startIntersection) - 1));
    positionX = (Car.rotCenterX) + ((radius) * (java.lang.Math.cos(((time * (Car.angularVelocity)) - offset))));
    positionY = (Car.rotCenterY) + ((radius) * (java.lang.Math.sin(((time * (Car.angularVelocity)) - offset))));
}
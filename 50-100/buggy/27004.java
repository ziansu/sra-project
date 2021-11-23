public void reset() {
    if ((spheroRobotProxy) != null) {
        spheroRobotProxy.drive(0, 0);
    }
    currentX = (getWidth()) / 2;
    currentY = (getHeight()) / 2;
    int shorterEdgeLength = ((getWidth()) < (getHeight())) ? getWidth() : getHeight();
    maxRadius = shorterEdgeLength / 2;
    minVelocity = java.lang.Math.pow(deadZoneRadius, 2);
    maxVelocity = java.lang.Math.pow(maxRadius, 2);
}
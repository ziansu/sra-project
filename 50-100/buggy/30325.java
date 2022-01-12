@java.lang.Override
public void init() {
    lastUpdateTime = java.lang.System.nanoTime();
    leftSpeed = 0;
    rightSpeed = 0;
    theta = 0;
    systemLayer.resetOrientation();
    systemLayer.resetLocalCoords();
    double[] coords = systemLayer.getCurrentLocalCoords();
    x = coords[0];
    y = coords[1];
    leftCount = systemLayer.getLeftEncoderCounts();
    rightCount = systemLayer.getRightEncoderCounts();
    angleFirst = true;
}
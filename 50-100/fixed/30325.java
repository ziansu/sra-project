@java.lang.Override
public void init() {
    lastUpdateTime = java.lang.System.nanoTime();
    leftSpeed = 0;
    rightSpeed = 0;
    theta = 0;
    systemLayer.resetOrientation();
    x = 0;
    y = 0;
    leftCount = systemLayer.getLeftEncoderCounts();
    rightCount = systemLayer.getRightEncoderCounts();
    angleFirst = true;
}
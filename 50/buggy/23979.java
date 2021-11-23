@java.lang.Override
public void overrideSpeedLimit(int speedLimit) {
    this.speedLimit = speedLimit;
    controller.setSpeedLimit(speedLimit);
}
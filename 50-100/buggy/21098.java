@java.lang.Override
public void overrideSpeedLimit(int speedLimit) {
    if ((speedLimit < 0) || (speedLimit > 500)) {
        user.setAlarmState(true);
    }
    if ((controller.getReferenceSpeed()) > (speedLimit * 2)) {
        user.setAlarmState(true);
    }
    this.speedLimit = speedLimit;
    controller.setSpeedLimit(speedLimit);
}
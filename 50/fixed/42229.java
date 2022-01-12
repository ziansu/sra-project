public void executeDefault() {
    if ((defaultTrajectory) == (stationaryTraj)) {
        stationaryTraj.execute();
    }else {
        joystickTraj.execute();
    }
}
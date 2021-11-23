public void setMotionProfilingActive() {
    motionProfilingActive = true;
    activeTrajectory = defaultTrajectory;
    nextTrajectory = defaultTrajectory;
    resetPID();
    resetWaypoints();
    hardware.chooseVelocityControl();
}
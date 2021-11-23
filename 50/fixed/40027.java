public void setMotionProfilingActive() {
    motionProfilingActive = true;
    activeTrajectory = defaultTrajectory;
    nextTrajectory = defaultTrajectory;
    resetWaypoints();
    resetPID();
    hardware.chooseVelocityControl();
}
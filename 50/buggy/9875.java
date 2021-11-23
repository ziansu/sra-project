public void setActive() {
    activeTrajectory = defaultTrajectory;
    nextTrajectory = defaultTrajectory;
    resetWaypoints();
    resetPID();
    isActive = true;
}
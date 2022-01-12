public void steerRight() {
    startTimerIfNotStarted();
    this.steerReleased = false;
    if ((timer.getDuration()) > (timeStep)) {
        if ((state) <= ((hu.oe.nik.szfmv17t.automatedcar.hmi.SteeringWheel.maxRight) - (steeringStep))) {
            state += steeringStep;
            automaticIndicationRight();
        }
        this.start();
    }
}
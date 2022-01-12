public void steerLeft() {
    startTimerIfNotStarted();
    this.steerReleased = false;
    if ((timer.getDuration()) > (timeStep)) {
        if ((state) >= ((hu.oe.nik.szfmv17t.automatedcar.hmi.SteeringWheel.maxLeft) + (steeringStep))) {
            state -= steeringStep;
            automaticIndicationLeft();
        }
        this.start();
    }
}
public void calibrate() {
    if ((this.hasGyro) == false) {
        return ;
    }
    this.gyro.calibrate();
}
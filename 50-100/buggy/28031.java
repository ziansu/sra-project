protected void driveMotor(int speed) {
    speed = convertMotorVal(speed);
    if (speed != (previousSpeed)) {
        previousSpeed = speed;
        if (!(zeroUsedPrev)) {
            speed = 0;
            zeroUsedPrev = True;
        }
    }
    mqtt.write(("motor|Speed:" + speed));
    motor.write(speed);
}
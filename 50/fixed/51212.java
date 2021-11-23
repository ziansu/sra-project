public void move(int ms, double speed) {
    motorBL.setPower(speed);
    motorBR.setPower(speed);
    motorFL.setPower(speed);
    motorFR.setPower(speed);
    halt();
}
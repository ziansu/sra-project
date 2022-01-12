public void startMotors(double power1, double power2, double power3, double power4) {
    motorBR.setPower((power1 * (divider)));
    motorBL.setPower((power2 * (divider)));
    motorFL.setPower((power3 * (divider)));
    motorFR.setPower((power4 * (divider)));
}
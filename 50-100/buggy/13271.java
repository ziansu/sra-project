public void setRotationPower(double power) {
    hoodPosition.set(hoodMotor.getEncoderPosition());
    if ((hoodPosition.get()) > (hoodExtendPosition.get())) {
        setRotationPower(0);
    }
    if ((hoodPosition.get()) < (hoodRetractPosition.get())) {
        setRotationPower(0);
    }
    hoodMotor.set(power);
}
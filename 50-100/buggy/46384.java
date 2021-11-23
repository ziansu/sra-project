public void Climb() {
    double speed = 0;
    if (OI.flight1.getRawButton(12)) {
        double yAxis = OI.flight1.getY();
        speed = yAxis;
        if ((m_ropeClimberMotor.getOutputCurrent()) > 60.0) {
            speed = 0;
        }
    }
    m_ropeClimberMotor.set(speed);
}
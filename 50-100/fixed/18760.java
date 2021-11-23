public double getPosition() {
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("m_Rtalon2.getPosition()", m_Rtalon2.getPosition());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("m_Ltalon2.getPosition()", m_Ltalon2.getPosition());
    return (((m_Rtalon2.getPosition()) + (m_Ltalon2.getPosition())) * 0.5) / (encoderTicksPerMeter);
}
public double getVelocity() {
    return ((((m_Rtalon2.getSpeed()) + (m_Ltalon2.getSpeed())) * 0.5) * 10) / (encoderTicksPerMeter);
}
public void setTargets(double v, double omega) {
    m_Rtalon2.set((((v - (omega * (halfTrackWidth))) * 0.1) * (encoderTicksPerMeter)));
    m_Ltalon2.set((((v + (omega * (halfTrackWidth))) * 0.1) * (encoderTicksPerMeter)));
}
private void updateControlWord(boolean force) {
    long now = java.lang.System.currentTimeMillis();
    synchronized(m_controlWordMutex) {
        if (((now - (m_lastControlWordUpdate)) > 50) || force) {
            edu.wpi.first.wpilibj.hal.HAL.getControlWord(m_controlWordCache);
            m_lastControlWordUpdate = now;
        }
    }
}
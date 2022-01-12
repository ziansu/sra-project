@java.lang.Override
public void run() {
    long currentTime = java.lang.System.currentTimeMillis();
    if ((m_lastAutoUpdateTime) == null) {
        m_lastAutoUpdateTime = currentTime;
    }
    double timeStep = (((double) (currentTime)) - (m_lastAutoUpdateTime)) / 1000.0;
    timeStep = (timeStep <= 0.0) ? 1.0E-5 : timeStep;
    update(timeStep, currentTime);
    m_lastAutoUpdateTime = currentTime;
    if (!(m_shutdown)) {
        m_postManager.postToUpdateThreadDelayed(this, m_autoUpdateRate);
    }
}
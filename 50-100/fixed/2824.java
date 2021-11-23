private void stop() {
    org.eclipse.kura.linux.position.PositionServiceImpl.s_logger.debug("PositionService stopping");
    if (((org.eclipse.kura.linux.position.PositionServiceImpl.monitorTask) != null) && (!(org.eclipse.kura.linux.position.PositionServiceImpl.monitorTask.isDone()))) {
        org.eclipse.kura.linux.position.PositionServiceImpl.stopThread = true;
        org.eclipse.kura.linux.position.PositionServiceImpl.monitorTask.cancel(true);
        org.eclipse.kura.linux.position.PositionServiceImpl.monitorTask = null;
    }
    if ((m_gpsDevice) != null) {
        m_gpsDevice.disconnect();
        m_gpsDevice = null;
    }
    m_configured = false;
    m_isRunning = false;
    m_hasLock = false;
}
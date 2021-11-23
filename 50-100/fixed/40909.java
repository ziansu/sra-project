@java.lang.Override
public void initialize() {
    m_drivetrain.setControlMode(TalonControlMode.PercentVbus);
    m_startTicks = m_drivetrain.getEncPosition();
    m_endTicks = (m_startTicks) + (m_drivetrain.getTicksPerRev());
    m_logger.info(((("initalized, start:" + (m_startTicks)) + " end:") + (m_endTicks)));
}
public void setPIDSourceType(edu.wpi.first.wpilibj.PIDSourceType pidSourceType) {
    super.setPIDSourceType(pidSourceType);
    m_controller.setOutputRange((-0.8), 0.8);
    if (pidSourceType == (edu.wpi.first.wpilibj.PIDSourceType.kDisplacement)) {
        m_controller.setInputRange((-180.0), 180.0);
        m_controller.setContinuous(true);
    }else {
        m_controller.setInputRange(0.0, 0.0);
        m_controller.setContinuous(false);
        lastHeading = mGyro.getYaw();
        gyroTimer.reset();
        gyroRate = 0.0;
    }
}
public void setPIDSourceType(edu.wpi.first.wpilibj.PIDSourceType pidSourceType) {
    super.setPIDSourceType(pidSourceType);
    m_controller.setOutputRange((-0.8), 0.8);
    m_controller.setContinuous(true);
    if (pidSourceType == (edu.wpi.first.wpilibj.PIDSourceType.kDisplacement)) {
        m_controller.setInputRange((-180.0), 180.0);
    }else {
        m_controller.setInputRange(0.0, 0.0);
        lastHeading = mGyro.getYaw();
        gyroTimer.reset();
        gyroRate = 0.0;
    }
}
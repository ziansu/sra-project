public void runOnce() {
    if ((java.lang.Thread.currentThread().getId()) == (edu.wpi.first.wpilibj.RobotBase.MAIN_THREAD_ID)) {
        throw new java.lang.IllegalStateException("Vision.runOnce() cannot be called from the main robot thread");
    }
    long frameTime = m_cvSink.grabFrame(image);
    if (frameTime == 0) {
        java.lang.String error = m_cvSink.getError();
        edu.wpi.first.wpilibj.DriverStation.reportError(error, true);
    }else {
        m_pipeline.process(image);
    }
    contourLogic();
}
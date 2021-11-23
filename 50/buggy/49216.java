@java.lang.Override
public void autonomousPeriodic() {
    frontDistanceSensor.updateDashboard();
    updateSmartDashboard();
}
@java.lang.Override
public void teleopPeriodic() {
    controlLidarMotor();
    commonPeriodic();
    if (teleopController.replayActivated()) {
    }
    while (replaying) {
        replayController.replayPeriodic(this);
        replaying = replayController.replaying();
    } 
    if ((teleopController) != null) {
        teleopController.teleopPeriodic(this);
    }else {
        java.lang.System.err.println("Teleop Controller on Robot is null in teleopPeriodic()");
    }
}
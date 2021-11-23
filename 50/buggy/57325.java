@java.lang.Override
public void teleopInit() {
    leds.activateTeleop();
    arm.calibrate(false);
    shooter.stop();
    arm.pickupAllStop();
    driveAuto.setPIDstate(false);
    drive.setPIDstate(true);
}
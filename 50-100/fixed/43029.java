public void runAutonomousProcess() {
    fireParticles();
    opMode.sleep(500);
    driveToNearBeacon();
    opMode.sleep(500);
    alignToBeacon();
    opMode.sleep(500);
    opMode.sleep(500);
    driveToFarBeacon();
    opMode.sleep(500);
    alignToBeacon();
    opMode.sleep(500);
}
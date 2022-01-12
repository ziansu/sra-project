@java.lang.Override
protected void main() {
    io.github.thunderbots.lightning.drive.DriveSystem ds = this.getRobot().getDrive();
    io.github.thunderbots.resQ.ResQRobot resQRobot = this.getRobot();
    ds.driveInches(io.github.thunderbots.resQ.encoder.ResQAutoOnlySkydivers.MOVEMENT_POWER, 100);
    io.github.thunderbots.lightning.utility.Util.sleep(io.github.thunderbots.resQ.encoder.ResQAutoOnlySkydivers.STEP_DELAY);
    resQRobot.moveLeftClimberArm(0);
    resQRobot.moveRightClimberArm(1);
    io.github.thunderbots.lightning.utility.Util.sleep(io.github.thunderbots.resQ.encoder.ResQAutoOnlySkydivers.STEP_DELAY);
    resQRobot.moveLeftClimberArm(1);
    resQRobot.moveRightClimberArm(0);
    io.github.thunderbots.lightning.utility.Util.sleep(500);
}
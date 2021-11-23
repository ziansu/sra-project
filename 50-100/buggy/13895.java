public void verifyBeaconColor() {
    colorSensor1.enableLed(false);
    org.firstinspires.ftc.teamcode.attachments.BeaconClaim.BeaconColor[] beaconColors = this.getBeaconColor();
    curOpMode.telemetry.addData("left: ", "%s", beaconColors[0].toString());
    curOpMode.telemetry.addData("right: ", "%s", beaconColors[1].toString());
    curOpMode.telemetry.update();
    com.qualcomm.ftccommon.DbgLog.msg("left value = %s, right value = %s", beaconColors[0].toString(), beaconColors[1].toString());
}
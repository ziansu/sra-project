@java.lang.Override
public void doCMD() {
    if (flag) {
        Robot.sensors.resetEncoder10();
        flag = false;
    }
    Robot.drive.moveCartesian(org.usfirst.frc1719.autonomous.GetInZone.NIL, org.usfirst.frc1719.autonomous.GetInZone.SPD, org.usfirst.frc1719.autonomous.GetInZone.NIL);
}
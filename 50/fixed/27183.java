@java.lang.Override
public boolean done() {
    return (java.lang.Math.abs(Robot.sensors.getEncoder10Distance())) > (org.usfirst.frc1719.autonomous.GetInZone.DISTANCE);
}
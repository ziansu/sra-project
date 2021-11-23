@java.lang.Override
public void initialize() {
    if (useAlliance) {
        if ((edu.wpi.first.wpilibj.DriverStation.getInstance().getAlliance()) == (DriverStation.Alliance.Red)) {
            directionMultiplier = 1;
        }else {
            directionMultiplier = -1;
        }
    }
    super.initialize();
}
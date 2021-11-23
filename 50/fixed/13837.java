public static void resetAfterLaunch() {
    org.usfirst.frc2832.Robot_2016.Kicker.REST_ANGLE = edu.wpi.first.wpilibj.Preferences.getInstance().getDouble("Kicker Rest Angle", 0);
    RobotMap.kicker.set(org.usfirst.frc2832.Robot_2016.Kicker.REST_ANGLE);
}
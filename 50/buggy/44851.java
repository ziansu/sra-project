@java.lang.Override
public void update() {
    if (slowMode) {
        verticalStrafe *= com.edinarobotics.zeppelin.subsystems.Drivetrain.SLOW_MODE_SPEED;
        horizontalStrafe *= com.edinarobotics.zeppelin.subsystems.Drivetrain.SLOW_MODE_SPEED;
        rotation *= com.edinarobotics.zeppelin.subsystems.Drivetrain.SLOW_MODE_SPEED;
    }
    slideDrive.drive(verticalStrafe, horizontalStrafe, rotation);
}
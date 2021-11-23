@java.lang.Override
public void teleopInit() {
    if ((org.montclairrobotics.sprocket.SprocketRobot.getDriveTrain()) != null)
        org.montclairrobotics.sprocket.SprocketRobot.getDriveTrain().teleopInit();
    
    super.teleopInit();
}
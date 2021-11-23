@java.lang.Override
public void testInit() {
    if ((org.montclairrobotics.sprocket.SprocketRobot.getDriveTrain()) != null)
        org.montclairrobotics.sprocket.SprocketRobot.getDriveTrain().teleopInit();
    
    super.testInit();
}
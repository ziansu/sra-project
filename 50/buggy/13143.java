@java.lang.Override
public void operatorControl() {
    myRobot.setSafetyEnabled(true);
    while ((isOperatorControl()) && (isEnabled())) {
        SendDataToSmartDashboard();
        myRobot.tankDrive(leftStick, rightStick);
        edu.wpi.first.wpilibj.Timer.delay(0.005);
    } 
}
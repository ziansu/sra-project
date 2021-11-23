public void teleopPeriodic() {
    boolean tooBool4Skewl = true;
    if (tooBool4Skewl == true) {
        myRobot.setSafetyEnabled(true);
        myRobot.tankDrive(leftStick.getY(), (-(rightStick.getY())));
        myArm.Move();
    }else {
    }
}
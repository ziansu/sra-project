public void teleopPeriodic() {
    boolean tooBool4Skewl = true;
    if (tooBool4Skewl == true) {
        myRobot.setSafetyEnabled(true);
        myRobot.tankDrive(leftStick, rightStick);
        myArm.Move();
        myRobot.tankDrive(((leftStick.getY()) - ((leftStick.getZ()) * 0.7)), ((leftStick.getY()) + ((leftStick.getZ()) * 0.7)));
    }else {
    }
}
public double getThrottle() {
    if ((ps4Controller.getRawAxis(org.usfirst.frc.team2363.robot.RIGHT_TRIGGER)) > 0) {
        return -(ps4Controller.getRawAxis(org.usfirst.frc.team2363.robot.LEFT_STICK_Y));
    }else {
        return ps4Controller.getRawAxis(org.usfirst.frc.team2363.robot.LEFT_STICK_Y);
    }
}
protected void execute() {
    if ((clamped) == false) {
        org.usfirst.frc.team4753.robot.Robot.pneumatics.grab();
        clamped = true;
    }else {
        org.usfirst.frc.team4753.robot.Robot.pneumatics.release();
        clamped = false;
    }
    finished = true;
}
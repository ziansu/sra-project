protected void execute() {
    if (up = true) {
        org.usfirst.frc.team4753.robot.Robot.pneumatics.lower();
        up = false;
    }else
        if (up = false) {
            org.usfirst.frc.team4753.robot.Robot.pneumatics.raise();
            up = true;
        }
    
    finished = true;
}
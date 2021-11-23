@java.lang.Override
protected void runContinuously() {
    wait.until(() -> (Robot.oi.drive.buttons.RB()) || (Robot.oi.drive.buttons.LB()));
    if (Robot.oi.drive.buttons.RB()) {
        Robot.servos.gearDropArm.setAngle(Robot.GEAR_DROPPER_OUT);
    }else
        if (Robot.oi.drive.buttons.LB()) {
            Robot.servos.gearDropArm.setAngle(Robot.GEAR_DROPPER_IN);
        }
    
}
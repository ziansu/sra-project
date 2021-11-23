public void execute() {
    int rotate = Robot.oi.getTurretRotateDirection();
    int lift = Robot.oi.getTurretLiftDirection();
    if (rotate == 1)
        Robot.turret.rotateLeft();
    else
        if (rotate == (-1))
            Robot.turret.rotateRight();
        else
            Robot.turret.stopRotating();
        
    
    if (lift == 1)
        Robot.turret.liftUp();
    else
        if (rotate == (-1))
            Robot.turret.liftDown();
        else
            Robot.turret.stopLifting();
        
    
}
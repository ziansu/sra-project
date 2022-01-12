protected boolean isFinished() {
    if ((Robot.clawArm.armAtBottom()) || (Robot.clawArm.armAtTop())) {
        return true;
    }else
        if ((Robot.clawArm.armPosition()) == (position)) {
            return true;
        }
    
    return false;
}
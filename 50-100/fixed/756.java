protected boolean isFinished() {
    if (((Robot.clawArm.armAtBottom()) && ((position) < (Robot.clawArm.armPosition()))) || ((Robot.clawArm.armAtTop()) && ((position) > (Robot.clawArm.armPosition())))) {
        return true;
    }else
        if ((Robot.clawArm.armPosition()) == (position)) {
            return true;
        }
    
    return false;
}
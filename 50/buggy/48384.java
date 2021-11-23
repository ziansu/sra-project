@java.lang.Override
protected boolean isFinished() {
    if ((Robot.ballHolder.getAngle()) > (java.lang.Math.abs(((org.stlpriory.robotics.commands.HolderToTop.MAX_ANGLE) - (org.stlpriory.robotics.commands.HolderToTop.TOLERANCE))))) {
        return true;
    }else {
        return false;
    }
}
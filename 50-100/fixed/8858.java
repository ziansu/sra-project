public void sleep() {
    destroyInverseKinematicsRunnable();
    activeMessageSource.set(null);
    if ((scheduled) == null) {
        if (us.ihmc.darpaRoboticsChallenge.networkProcessor.kinematicsToolboxModule.KinematicsToolboxModule.DEBUG)
            us.ihmc.tools.io.printing.PrintTools.error(this, "There is no task running.");
        
        return ;
    }
    scheduled.cancel(true);
    scheduled = null;
}
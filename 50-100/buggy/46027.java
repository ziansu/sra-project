@java.lang.Override
public void doTransitionIntoAction() {
    desiredVelocityProvider.setToZero();
    desiredYawRateProvider.setToZero();
    for (us.ihmc.robotics.screwTheory.OneDoFJoint oneDofJoint : oneDoFJointsActual) {
        oneDofJoint.setUnderPositionControl(true);
    }
    actualFullRobotModel.updateFrames();
    referenceFrames.updateFrames();
    setFeedForwardToActuals();
    updateEstimates();
    updateFeedForwardModelAndFrames();
    walkingStateMachine.setCurrentState(us.ihmc.quadrupedRobotics.controller.QuadrupedPositionBasedCrawlController.CrawlGateWalkingState.ALPHA_FILTERING_DESIREDS);
}
public void readControllerDataIntoEstimator() {
    for (int i = 0; i < (estimatorFeet.size()); i++) {
        us.ihmc.robotics.screwTheory.RigidBody foot = estimatorFeet.get(i);
        estimatorCenterOfPressureDataHolder.setCenterOfPressure(centerOfPressure.get(foot.getName()), foot);
    }
    if ((robotMotionStatus.get()) != null)
        estimatorRobotMotionStatusHolder.setCurrentRobotMotionStatus(robotMotionStatus.getAndSet(null));
    
    intermediateDesiredJointDataHolder.readIntoEstimator();
}
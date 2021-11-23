public void readControllerDataIntoEstimator() {
    for (us.ihmc.robotics.screwTheory.RigidBody foot : estimatorFeet) {
        estimatorCenterOfPressureDataHolder.setCenterOfPressure(centerOfPressure.get(foot.getName()), foot);
    }
    if ((robotMotionStatus.get()) != null)
        estimatorRobotMotionStatusHolder.setCurrentRobotMotionStatus(robotMotionStatus.getAndSet(null));
    
    intermediateDesiredJointDataHolder.readIntoEstimator();
}
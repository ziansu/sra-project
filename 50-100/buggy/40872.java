public void writeControllerDataFromController() {
    for (us.ihmc.robotics.screwTheory.RigidBody foot : controllerFeet) {
        controllerCenterOfPressureDataHolder.getCenterOfPressureByName(centerOfPressure.get(foot.getName()), foot);
    }
    robotMotionStatus.set(controllerRobotMotionStatusHolder.getCurrentRobotMotionStatus());
    intermediateDesiredJointDataHolder.copyFromController();
}
public void writeControllerDataFromController() {
    for (int i = 0; i < (controllerFeet.size()); i++) {
        us.ihmc.robotics.screwTheory.RigidBody foot = controllerFeet.get(i);
        controllerCenterOfPressureDataHolder.getCenterOfPressureByName(centerOfPressure.get(foot.getName()), foot);
    }
    robotMotionStatus.set(controllerRobotMotionStatusHolder.getCurrentRobotMotionStatus());
    intermediateDesiredJointDataHolder.copyFromController();
}
public void setControlFramePose(us.ihmc.euclid.transform.RigidBodyTransform controlFrameTransform) {
    controlFramePose.setPoseIncludingFrame(bodyFrame, controlFrameTransform);
    this.controlFrame.setPoseAndUpdate(controlFramePose);
    spatialFeedbackControlCommand.setControlFrameFixedInEndEffector(controlFramePose);
}
public void updateFeetPositionsWhenTrustingIMUOnly(us.ihmc.robotics.geometry.FramePoint pelvisPosition) {
    for (int i = 0; i < (feetRigidBodies.size()); i++) {
        us.ihmc.robotics.screwTheory.RigidBody foot = feetRigidBodies.get(i);
        updateFootPosition(foot, pelvisPosition);
    }
}
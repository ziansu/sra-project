@java.lang.Override
protected void jointDependentSetAndGetRotation(us.ihmc.euclid.matrix.RotationMatrix Rh_i) {
    java.lang.System.out.println("RigidJoint jointDependentSetAndGetRotation");
    Rh_i.set(owner.getRigidRotation());
    Rh_i.invert();
}
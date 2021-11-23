@java.lang.Override
protected void jointDependentSet_d_i() {
    d_i.set(owner.getLink().getComOffset());
    owner.getRigidRotation().inverseTransform(d_i);
    d_i.add(owner.getRigidTranslation());
}
public void set(double time, us.ihmc.robotics.geometry.FrameOrientation orientation, us.ihmc.robotics.geometry.FrameVector angularVelocity) {
    checkReferenceFrameMatch(orientation);
    checkReferenceFrameMatch(angularVelocity);
    this.time.set(time);
    this.orientation.set(orientation.getQuaternion());
    this.angularVelocity.set(angularVelocity.getVector());
}
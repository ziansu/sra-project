public void set(double time, us.ihmc.robotics.geometry.FrameOrientation orientation, us.ihmc.robotics.geometry.FrameVector angularVelocity) {
    setTime(time);
    checkReferenceFrameMatch(orientation);
    checkReferenceFrameMatch(angularVelocity);
    this.orientation.set(orientation.getQuaternion());
    this.angularVelocity.set(angularVelocity.getVector());
}
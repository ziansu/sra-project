public void set(double time, us.ihmc.robotics.geometry.FramePoint position, us.ihmc.robotics.geometry.FrameOrientation orientation, us.ihmc.robotics.geometry.FrameVector linearVelocity, us.ihmc.robotics.geometry.FrameVector angularVelocity) {
    setTime(time);
    this.position.set(position);
    this.orientation.set(orientation);
    this.linearVelocity.set(linearVelocity);
    this.angularVelocity.set(angularVelocity);
}
public void set(us.ihmc.robotics.dataStructures.variable.DoubleYoVariable time, us.ihmc.robotics.math.frames.YoFramePoint position, us.ihmc.robotics.math.frames.YoFrameQuaternion orientation, us.ihmc.robotics.math.frames.YoFrameVector linearVelocity, us.ihmc.robotics.math.frames.YoFrameVector angularVelocity) {
    this.time.set(time.getDoubleValue());
    this.position.set(position);
    this.orientation.set(orientation);
    this.linearVelocity.set(linearVelocity);
    this.angularVelocity.set(angularVelocity);
}
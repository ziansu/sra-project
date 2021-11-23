public void set(us.ihmc.robotics.dataStructures.variable.DoubleYoVariable time, us.ihmc.robotics.math.frames.YoFrameQuaternion orientation, us.ihmc.robotics.math.frames.YoFrameVector angularVelocity) {
    this.time.set(time.getDoubleValue());
    this.orientation.set(orientation);
    this.angularVelocity.set(angularVelocity);
}
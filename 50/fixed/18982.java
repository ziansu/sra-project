public void set(us.ihmc.robotics.dataStructures.variable.DoubleYoVariable time, us.ihmc.robotics.math.frames.YoFramePoint position, us.ihmc.robotics.math.frames.YoFrameVector linearVelocity) {
    this.time.set(time.getDoubleValue());
    this.position.set(position);
    this.linearVelocity.set(linearVelocity);
}
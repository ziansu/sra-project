public io.getcoffee.motionprofiles.Tuple<io.getcoffee.motionprofiles.MotionTrajectoryPoint, io.getcoffee.motionprofiles.MotionTrajectoryPoint> calcPoint(int tick) {
    io.getcoffee.motionprofiles.Tuple<java.lang.Double, io.getcoffee.motionprofiles.WheelTrajectorySegment> leftWheelTick = leftWheelTickMap.get(tick);
    io.getcoffee.motionprofiles.Tuple<java.lang.Double, io.getcoffee.motionprofiles.WheelTrajectorySegment> rightWheelTick = rightWheelTickMap.get(tick);
    return new io.getcoffee.motionprofiles.Tuple(leftWheelTick.getY().findSetPoint(leftWheelTick.getX(), tick), rightWheelTick.getY().findSetPoint(rightWheelTick.getX(), tick));
}
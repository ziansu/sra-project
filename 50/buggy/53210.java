public void initializeCoMPositionToActual(us.ihmc.robotics.geometry.FramePoint initialCoMPosition) {
    initializeToActual = true;
    centerOfMassPosition.set(initialCoMPosition);
    yoCenterOfMassPosition.set(initialCoMPosition);
}
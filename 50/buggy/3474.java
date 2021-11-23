public us.ihmc.robotics.geometry.FramePoint getCenterOfMassOffset() {
    javax.vecmath.Vector3d comOffsetVector = new javax.vecmath.Vector3d(crossPart);
    comOffsetVector.negate();
    comOffsetVector.scale((1.0 / (mass)));
    us.ihmc.robotics.geometry.FramePoint centerOfMassOffset = new us.ihmc.robotics.geometry.FramePoint(expressedInframe, comOffsetVector);
    return centerOfMassOffset;
}
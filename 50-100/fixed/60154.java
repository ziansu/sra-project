private void getDoubleSupportPolygonCentroid(us.ihmc.euclid.referenceFrame.FramePoint3D framePointToPack, us.ihmc.robotics.geometry.FrameConvexPolygon2d supportFootPolygon, us.ihmc.robotics.geometry.FrameConvexPolygon2d swingFootPolygon, us.ihmc.euclid.referenceFrame.ReferenceFrame referenceFrameToStoreResultIn) {
    tempFramePoint1.setIncludingFrame(swingFootPolygon.getCentroid(), 0.0);
    tempFramePoint1.changeFrame(referenceFrameToStoreResultIn);
    tempFramePoint2.setIncludingFrame(supportFootPolygon.getCentroid(), 0.0);
    tempFramePoint2.changeFrame(referenceFrameToStoreResultIn);
    framePointToPack.changeFrame(referenceFrameToStoreResultIn);
    framePointToPack.interpolate(tempFramePoint1, tempFramePoint2, 0.5);
}
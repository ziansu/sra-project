private void computeEntryCMPForSupportFoot(us.ihmc.robotics.geometry.FramePoint entryCMPToPack, us.ihmc.robotics.robotSide.RobotSide robotSide, us.ihmc.robotics.geometry.FramePoint2d centroidInSoleFrameOfPreviousSupportFoot, us.ihmc.robotics.math.frames.YoFramePoint previousLateCMP) {
    us.ihmc.robotics.referenceFrames.ReferenceFrame soleFrame = soleZUpFrames.get(robotSide);
    tempSupportPolygon.setIncludingFrameAndUpdate(supportFootPolygonsInSoleZUpFrame.get(robotSide));
    tempSupportPolygon.changeFrame(soleFrame);
    computeEntryCMP(entryCMPToPack, robotSide, soleFrame, tempSupportPolygon, centroidInSoleFrameOfPreviousSupportFoot, previousLateCMP);
}
private void computeEntryCMPForFootstep(us.ihmc.robotics.geometry.FramePoint entryCMPToPack, us.ihmc.humanoidRobotics.footstep.Footstep footstep, us.ihmc.robotics.geometry.FramePoint2d centroidInSoleFrameOfPreviousSupportFoot, us.ihmc.robotics.math.frames.YoFramePoint previousExitCMP) {
    us.ihmc.robotics.referenceFrames.ReferenceFrame soleFrame = footstep.getSoleReferenceFrame();
    java.util.List<javax.vecmath.Point2d> predictedContactPoints = footstep.getPredictedContactPoints();
    us.ihmc.robotics.robotSide.RobotSide robotSide = footstep.getRobotSide();
    if (predictedContactPoints != null)
        tempSupportPolygon.setIncludingFrameAndUpdate(soleFrame, predictedContactPoints);
    else
        tempSupportPolygon.setIncludingFrameAndUpdate(soleFrame, defaultFootPolygons.get(robotSide));
    
    computeEntryCMP(entryCMPToPack, robotSide, soleFrame, centroidInSoleFrameOfPreviousSupportFoot, previousExitCMP);
}
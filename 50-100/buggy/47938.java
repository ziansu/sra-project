private void computeExitCMPForSupportFoot(us.ihmc.robotics.geometry.FramePoint exitCMPToPack, us.ihmc.robotics.robotSide.RobotSide robotSide, us.ihmc.robotics.geometry.FramePoint2d centroidInSoleFrameOfUpcomingSupportFoot, boolean isUpcomingFootstepLast) {
    if (useTwoCMPsPerSupport) {
        us.ihmc.robotics.referenceFrames.ReferenceFrame soleFrame = soleZUpFrames.get(robotSide);
        tempSupportPolygon.setIncludingFrameAndUpdate(supportFootPolygonsInSoleZUpFrame.get(robotSide));
        tempSupportPolygon.changeFrame(soleFrame);
        computeExitCMP(exitCMPToPack, robotSide, soleFrame, centroidInSoleFrameOfUpcomingSupportFoot, isUpcomingFootstepLast);
    }else {
        exitCMPToPack.setToNaN(us.ihmc.commonWalkingControlModules.instantaneousCapturePoint.ReferenceCentroidalMomentumPivotLocationsCalculator.worldFrame);
    }
}
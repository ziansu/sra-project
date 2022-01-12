public void initializeForDoubleSupport(int numberOfFootstepsToConsider, java.util.ArrayList<us.ihmc.robotics.math.frames.YoFramePoint2d> upcomingFootstepLocations, boolean isStanding, boolean useTwoCMPs, us.ihmc.robotics.robotSide.RobotSide transferToSide, double omega0) {
    referenceCMPsCalculator.setUseTwoCMPsPerSupport(useTwoCMPs);
    referenceCMPsCalculator.computeReferenceCMPsStartingFromDoubleSupport(isStanding, transferToSide);
    referenceCMPsCalculator.update();
    initializeCornerPoints(useTwoCMPs, omega0);
    computeFinalICP(numberOfFootstepsToConsider, useTwoCMPs, true);
    stateMultiplierCalculator.initializeForDoubleSupport();
    computeCMPOffsetRecursion(upcomingFootstepLocations, numberOfFootstepsToConsider);
}
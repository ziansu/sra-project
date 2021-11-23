public void initializeForSingleSupport(int numberOfFootstepsToConsider, java.util.ArrayList<us.ihmc.robotics.math.frames.YoFramePoint2d> upcomingFootstepLocations, boolean useTwoCMPs, us.ihmc.robotics.robotSide.RobotSide supportSide, double omega0) {
    referenceCMPsCalculator.setUseTwoCMPsPerSupport(useTwoCMPs);
    referenceCMPsCalculator.computeReferenceCMPsStartingFromSingleSupport(supportSide);
    referenceCMPsCalculator.update();
    initializeCornerPoints(useTwoCMPs, omega0);
    computeFinalICP(numberOfFootstepsToConsider);
    stateMultiplierCalculator.initializeForSingleSupport();
    computeCMPOffsetRecursion(upcomingFootstepLocations, numberOfFootstepsToConsider);
}
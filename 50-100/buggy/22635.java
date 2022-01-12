private boolean areFeetLoadedEnough() {
    double totalLoadPercentage = 0.0;
    for (us.ihmc.robotics.screwTheory.RigidBody foot : feet)
        totalLoadPercentage += footSwitches.get(foot).computeFootLoadPercentage();
    
    totalLoadPercentageOnFeet.set(totalLoadPercentage);
    boolean areFeetLoadedEnough = (totalLoadPercentageOnFeet.getDoubleValue()) > (loadPercentageOnFeetThresholdForIMUDrift.getDoubleValue());
    isIMUDriftFeetLoadedEnough.set(areFeetLoadedEnough);
    return areFeetLoadedEnough;
}
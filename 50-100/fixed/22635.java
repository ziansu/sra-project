private boolean areFeetLoadedEnough() {
    double totalLoadPercentage = 0.0;
    for (int i = 0; i < (feet.size()); i++) {
        us.ihmc.robotics.screwTheory.RigidBody foot = feet.get(i);
        totalLoadPercentage += footSwitches.get(foot).computeFootLoadPercentage();
    }
    totalLoadPercentageOnFeet.set(totalLoadPercentage);
    boolean areFeetLoadedEnough = (totalLoadPercentageOnFeet.getDoubleValue()) > (loadPercentageOnFeetThresholdForIMUDrift.getDoubleValue());
    isIMUDriftFeetLoadedEnough.set(areFeetLoadedEnough);
    return areFeetLoadedEnough;
}
@java.lang.Override
public int getHeatCapacityWithWater() {
    if (hasLaserHeatSinks()) {
        return getHeatCapacity();
    }
    return (getHeatCapacity(true, false)) + (java.lang.Math.min(sinksUnderwater(), 6));
}
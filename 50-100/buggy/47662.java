public void dimToValue(int value) {
    actualValue = value;
    if ((useOffset) && ((value + (mfi.riseandshinepi.hardware.DisplayBacklight.OFFSET)) <= (mfi.riseandshinepi.hardware.DisplayBacklight.MAX_VALUE))) {
        value = value + (mfi.riseandshinepi.hardware.DisplayBacklight.OFFSET);
    }
    if (processor.isDevelopmentMode()) {
        dimToValueInSimulation(value);
    }else {
        dimToValueInHardware(value);
    }
}
public void gearUp() {
    GearChangeTimer();
    if ((manualGearState) < (maxGear)) {
        (manualGearState)++;
    }else {
        manualGearState = maxGear;
    }
}
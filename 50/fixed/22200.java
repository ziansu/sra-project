public void gearUp() {
    if ((manualGearState) < (maxGear)) {
        (manualGearState)++;
    }else {
        manualGearState = maxGear;
    }
}
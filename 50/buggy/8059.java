public void gearDown() {
    GearChangeTimer();
    if ((manualGearState) > 0) {
        (manualGearState)--;
    }else {
        manualGearState = 0;
    }
}
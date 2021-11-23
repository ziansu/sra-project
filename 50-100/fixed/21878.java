public float getGearMaxSpeed() {
    Bus.Bus.GearPosition gear = bus.getGearPosition();
    if (gear == (Bus.GearPosition.NEUTRAL)) {
        return GEAR_N_MAX_SPEED;
    }
    if (gear == (Bus.GearPosition.REVERSE)) {
        return GEAR_R_MAX_SPEED;
    }
    if (gear == (Bus.GearPosition.PARK)) {
        return GEAR_P_MAX_SPEED;
    }
    if (gear == (Bus.GearPosition.DRIVE)) {
        return GEAR_D_MAX_SPEED;
    }
    return 0;
}
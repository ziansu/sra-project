public int actualGearState(hu.oe.nik.szfmv17t.automatedcar.hmi.AutoGearStates autoGearState, int actualGear, double actualVelocity) {
    switch (autoGearState) {
        case R :
            return 0;
        case P :
        case N :
            return 1;
        case D :
            return switchGearDependOnSpeed(actualGear, actualVelocity);
        default :
            return -1;
    }
}
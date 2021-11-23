void setAc(boolean b) {
    state.setHeatPower(false);
    state.setHeat(false);
    state.setAc(false);
    state.setFan(false);
    state.setFanPower(b);
    state.setAcPower(b);
    if (b == false) {
        state.setAc(false);
        state.setFan(false);
    }
}
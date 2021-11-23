public double getValue() {
    org.openhab.binding.loxone.core.LxControlState state = getState(org.openhab.binding.loxone.core.LxControlInfoOnlyDigital.STATE_ACTIVE);
    if (state != null) {
        return state.getValue();
    }
    return 0;
}
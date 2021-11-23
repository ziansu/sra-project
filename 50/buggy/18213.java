public double getState() {
    org.openhab.binding.loxone.core.LxControlState state = getState(org.openhab.binding.loxone.core.LxControlSwitch.STATE_ACTIVE);
    if (state != null) {
        return state.getValue();
    }
    throw new java.lang.NullPointerException("Switch state 'active' is null");
}
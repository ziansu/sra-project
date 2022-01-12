public double getPosition() {
    org.openhab.binding.loxone.core.LxControlState state = getState(org.openhab.binding.loxone.core.LxControlJalousie.STATE_POSITION);
    if (state != null) {
        return state.getValue();
    }
    return -1;
}
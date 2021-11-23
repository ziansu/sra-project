public double getPosition() {
    org.openhab.binding.loxone.core.LxControlState state = getState(org.openhab.binding.loxone.core.LxControlJalousie.STATE_POSITION);
    if (state != null) {
        return state.getValue();
    }
    throw new java.lang.NullPointerException("Jalousie state 'position' is null");
}
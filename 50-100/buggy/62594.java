public static de.jondoe.hue.LightState from(java.lang.String state) {
    com.google.common.base.Preconditions.checkNotNull(state, de.jondoe.hue.LightState.ERROR_MESSAGE);
    int integerState = java.lang.Integer.valueOf(state);
    if (!(de.jondoe.hue.LightState.VALID_RANGE.contains(integerState))) {
        throw new java.lang.IllegalArgumentException(de.jondoe.hue.LightState.ERROR_MESSAGE);
    }
    return new de.jondoe.hue.LightState();
}
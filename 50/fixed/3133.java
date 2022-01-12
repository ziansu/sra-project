public static boolean isValidState(int state) {
    return themeable.res.ResourceUtils.STATE_LOOKUP.containsValue(java.lang.Math.abs(state));
}
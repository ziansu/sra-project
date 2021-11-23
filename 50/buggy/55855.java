public static net.kikuchy.kenin.condition.Condition<java.lang.CharSequence> same(java.lang.CharSequence expected, java.lang.String errorMessage) {
    return new net.kikuchy.kenin.internal.SameCondition(expected, errorMessage);
}
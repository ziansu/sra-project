@rpg.value.Immutable
protected java.math.MathContext getContext() {
    return new java.math.MathContext(getUnit().getPrecision(), java.math.RoundingMode.HALF_EVEN);
}
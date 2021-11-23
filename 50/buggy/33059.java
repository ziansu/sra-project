private double normalizedMaxGap() {
    return (absoluteMaxAllowedGapValue) == null ? 0.0 : (absoluteMaxAllowedGapValue.doubleValue()) / ((absoluteMaxValuePrim) - (absoluteMinValuePrim));
}
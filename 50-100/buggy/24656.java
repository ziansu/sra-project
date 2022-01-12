@java.lang.Override
public float normalize(java.lang.Number value, org.gephi.appearance.api.Interpolator interpolator) {
    float normalizedValue = ((float) ((value.doubleValue()) - (min.doubleValue()))) / ((float) ((max.doubleValue()) - (min.doubleValue())));
    return interpolator.interpolate(normalizedValue);
}
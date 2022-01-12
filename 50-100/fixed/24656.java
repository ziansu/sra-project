@java.lang.Override
public float normalize(java.lang.Number value, org.gephi.appearance.api.Interpolator interpolator) {
    if (min.equals(max)) {
        return 1.0F;
    }
    float normalizedValue = ((float) ((value.doubleValue()) - (min.doubleValue()))) / ((float) ((max.doubleValue()) - (min.doubleValue())));
    return interpolator.interpolate(normalizedValue);
}
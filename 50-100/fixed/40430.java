public java.lang.Double deScale(java.lang.Double scale) {
    java.lang.Double value = 0.0;
    java.lang.Double min = java.util.Collections.min(mins);
    java.lang.Double max = java.util.Collections.max(maxs);
    if (scale > max) {
        return new java.lang.Double(1);
    }
    if (scale < min) {
        return new java.lang.Double(0);
    }
    value = (scale * (max - min)) + min;
    return value;
}
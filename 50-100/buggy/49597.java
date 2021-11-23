public java.lang.Double calScale(java.lang.Double value, int index) {
    java.lang.Double scale = 0.0;
    java.lang.Double min = mins.get(index);
    java.lang.Double max = maxs.get(index);
    scale = (value - min) / (max - min);
    return scale;
}
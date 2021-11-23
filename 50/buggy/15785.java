public geometry.Dimension.Mutable set(float w, float h, boolean allowNegatives) {
    width = w;
    height = h;
    allowNegativeVals = allowNegatives;
    return this;
}
public void updateNonXYScanSlice(int dim, int value) {
    for (int i = 0; i < (nonXYScanDimensions.length); i++) {
        if (dim == (nonXYScanDimensions[i])) {
            nonXYDimensionValues[i] = value;
        }
    }
}
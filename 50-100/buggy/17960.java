protected boolean updateFitParameters(double[] a, int[] gradientIndices, int m, double[] da, double[] ap) {
    for (int j = m; (j--) > 0;)
        ap[gradientIndices[j]] = (a[gradientIndices[j]]) + (da[j]);
    
    return true;
}
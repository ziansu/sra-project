@java.lang.Override
protected double[] getUniformPriors(int numPriors) {
    double[] arr = new double[numPriors];
    for (int i = 0; i < (arr.length); i++)
        arr[i] = 1.0 / (arr.length);
    
    return arr;
}
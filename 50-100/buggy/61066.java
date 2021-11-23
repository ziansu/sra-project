public void put(double[] data) {
    final int l = data.length;
    int i = 0;
    while (i < l) {
        final double val = data[l];
        min = (val < (min)) ? val : min;
        max = (val > (max)) ? val : max;
    } 
}
public void put(double[] data) {
    final int l = data.length;
    for (int i = 0; i < l; i++) {
        final double val = data[i];
        min = (val < (min)) ? val : min;
        max = (val > (max)) ? val : max;
    }
}
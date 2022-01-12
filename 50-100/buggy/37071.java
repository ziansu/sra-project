private int thresholdDetect(float[] a, float threshold) {
    int i;
    for (i = 1; i < ((a.length) - 1); i++) {
        if ((a[i]) > threshold) {
            break;
        }
    }
    return i >= ((a.length) - 2) ? -1 : i;
}
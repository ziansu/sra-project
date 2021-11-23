private int thresholdDetectPositive(float[] a, float threshold) {
    for (int i = 0; i < ((a.length) - 1); i++) {
        if (((a[i]) <= threshold) && ((a[(i + 1)]) > threshold)) {
            return i + 1;
        }
    }
    return -1;
}
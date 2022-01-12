private int thresholdDetectPositive(float[] a, float threshold) {
    int i;
    for (i = 1; i < ((a.length) - 1); i++) {
        if (((a[(i - 1)]) < threshold) && ((a[(i + 1)]) >= threshold)) {
            break;
        }
    }
    return i >= ((a.length) - 2) ? -1 : i;
}
@java.lang.Override
void load(int start, int[] values, int mask) {
    int n = java.lang.Math.min(values.length, ((data.length) - start));
    for (int i = start; i < n; i++) {
        data[i] = (values[i]) & mask;
    }
}
private long bruteForce() {
    int len = array.length;
    long max = java.lang.Integer.MIN_VALUE;
    for (int i = 0; i < len; i++) {
        int t = array[i];
        for (int j = 1; j < len; j++) {
            if (t > max) {
                max = t;
            }
            t += array[j];
        }
    }
    return max;
}
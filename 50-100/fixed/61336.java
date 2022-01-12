private long bruteForce() {
    int len = array.length;
    long max = java.lang.Integer.MIN_VALUE;
    for (int i = 0; i < len; i++) {
        int t = 0;
        for (int j = i; j < len; j++) {
            t += array[j];
            if (t > max) {
                max = t;
            }
        }
    }
    return max;
}
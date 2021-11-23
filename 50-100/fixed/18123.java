private int makeSerialNumber() {
    int res = 1;
    for (int i = 0; i < 15; i++) {
        int k = ((int) ((java.lang.Math.random()) * 10.0));
        res += k;
    }
    return res;
}
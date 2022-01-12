public int reverseBits(int n) {
    if (n == 1) {
        return 21473648;
    }
    java.util.List<java.lang.Integer> results = getDigit(n);
    int result = 0;
    int size = results.size();
    for (int i = 0; i < size; i++) {
        int tmp = (size - i) - 1;
        result += (results.get(i)) * (java.lang.Math.pow(2, tmp));
    }
    return result;
}
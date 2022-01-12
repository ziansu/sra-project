public boolean judgeSquareSum(int c) {
    if (c == 0) {
        return true;
    }
    for (int i = 1; i <= (java.lang.Math.sqrt(c)); i++) {
        int a = i * i;
        if (a > c) {
            break;
        }
        double b = java.lang.Math.sqrt((c - a));
        if (b == ((int) (b))) {
            return true;
        }
    }
    return false;
}
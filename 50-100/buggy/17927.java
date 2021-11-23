public boolean judgeSquareSum(int c) {
    for (int i = 1; i <= (c / 2); i++) {
        double a = java.lang.Math.sqrt(i);
        double b = java.lang.Math.sqrt((c - i));
        if ((a == ((int) (a))) && (b == ((int) (b)))) {
            return true;
        }
    }
    return false;
}
public int calculate(int start) {
    if (start < 0) {
        throw new java.lang.IllegalArgumentException("Factorials are defined only on non-negative integers.");
    }
    int result = start;
    if (result > 1) {
        result = start * (factorial((start - 1)));
    }
    return result;
}
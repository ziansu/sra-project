public final double normalize() {
    double sum = sumUp();
    if (sum != 0.0) {
        divide(sum);
    }else {
        java.util.Arrays.fill(_cells, (1.0 / (getDomainSize())));
    }
    return sum;
}
private static boolean isNumberBetween(int num, int num1, int num2) {
    int min = java.lang.Math.min(num1, num2);
    int max = java.lang.Math.max(num1, num2);
    return (num >= min) && (num <= max);
}
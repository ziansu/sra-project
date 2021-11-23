public static double sumOfAdjacentNumbers(java.lang.String string, int startPos, int iterations) {
    double result = 1;
    for (int i = 0; i < iterations; i++) {
        result = result * (string.charAt((startPos + i)));
        java.lang.System.out.print(string.charAt((startPos + i)));
    }
    return result;
}
public static int gcd(int a, int b) {
    return b == 0 ? a : BacktrackingAlgorithms.gcd(b, (a % b));
}
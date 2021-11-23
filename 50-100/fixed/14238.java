public static void main(java.lang.String[] args) {
    java.util.HashSet<java.lang.Double> powHash = new java.util.HashSet<>();
    for (double a = 2; a <= 100; a++) {
        for (double b = 2; b <= 100; b++) {
            powHash.add(java.lang.Math.pow(a, b));
        }
    }
    java.lang.System.out.println(powHash.size());
}
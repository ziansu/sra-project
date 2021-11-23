public static boolean testEquivalence(java.util.Random rng1, java.util.Random rng2, int iterations) {
    for (int i = 0; i < iterations; i++) {
        if ((rng1.nextInt()) != (rng2.nextInt())) {
            return false;
        }
    }
    return true;
}
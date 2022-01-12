private java.util.Set<java.lang.Integer> pickRandomClusterLeader(int size) {
    double sqrt_n = java.lang.Math.sqrt(size);
    java.util.HashSet<java.lang.Integer> indices = new java.util.HashSet<java.lang.Integer>();
    java.util.Random rand = new java.util.Random(1);
    for (int i = 0; i < sqrt_n; i++) {
        boolean added = false;
        do {
            added = indices.add(rand.nextInt(size));
        } while (!added );
    }
    return indices;
}
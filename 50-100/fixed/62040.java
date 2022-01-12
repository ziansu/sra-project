private static java.util.Set<java.lang.String> getAllKmers(java.util.Set<java.lang.String> dnas, int k) {
    java.util.Set<java.lang.String> allKMersFromDNAs = new java.util.HashSet<java.lang.String>();
    for (java.lang.String dna : dnas) {
        for (int i = 0; i < (((dna.length()) - k) + 1); i++) {
            java.lang.String kmer = dna.substring(i, (i + k));
            allKMersFromDNAs.add(kmer);
        }
    }
    return allKMersFromDNAs;
}
public static void shuffle(java.lang.Comparable[] a) {
    for (int i = 1; i < (a.length); i++) {
        int randomIndex = edu.princeton.cs.algs4.StdRandom.uniform(i);
        com.jaichaudhary.algorithms.sort.ShuffleSort.exch(a, i, randomIndex);
    }
}
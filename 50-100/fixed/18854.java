public static void shuffle(java.lang.Comparable[] a) {
    for (int i = 0; i < (a.length); i++) {
        int randomIndex = edu.princeton.cs.algs4.StdRandom.uniform((i + 1));
        com.jaichaudhary.algorithms.sort.ShuffleSort.exch(a, i, randomIndex);
    }
}
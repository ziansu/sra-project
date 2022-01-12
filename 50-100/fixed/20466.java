public static void main(java.lang.String[] args) {
    int N = edu.princeton.cs.algs4.StdIn.readInt();
    java.lang.Double[] input = new java.lang.Double[N];
    for (int i = 0; i < N; i++) {
        input[i] = edu.princeton.cs.algs4.StdRandom.uniform();
    }
    com.jaichaudhary.algorithms.sort.MergeSort.sort(input);
    com.jaichaudhary.algorithms.sort.MergeSort.display(input);
}
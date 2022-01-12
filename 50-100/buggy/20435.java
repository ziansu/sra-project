public static void sort(int[] pq) {
    int N = pq.length;
    for (int i = (N / 2) - 1; i >= 0; i--)
        HeapSortStartWithZero.sink(pq, i, N);
    
    int j = N - 1;
    while (j >= 0) {
        java.lang.System.out.println(pq[0]);
        HeapSortStartWithZero.exch(pq, 0, (j--));
        HeapSortStartWithZero.sink(pq, 0, j);
    } 
}
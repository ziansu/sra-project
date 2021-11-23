public static void main(java.lang.String[] args) {
    int[] A = new int[]{ 1 , 2 , 4 , 3 };
    sorting_algorithms.MergeSort.Merge_Sort_Algorithm(A, 0, ((A.length) - 1), 0);
    sorting_algorithms.MergeSort.printArray("Sorted Array: ", A);
}